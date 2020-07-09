package com.nedev.eboko.services;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mobandme.android.transformer.Transformer;
import com.nedev.eboko.models.entities.Devoir;
import com.nedev.eboko.models.entities.Etudiant;
import com.nedev.eboko.models.entities.Note;
import com.nedev.eboko.models.vo.DevoirVo;
import com.nedev.eboko.models.vo.EtudiantVo;
import com.nedev.eboko.models.vo.NoteVo;
import com.nedev.eboko.tools.Constantes;
import com.nedev.eboko.tools.JsonDateDeserializer;
import com.nedev.eboko.tools.ObjectBox;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import io.objectbox.Box;
import okhttp3.Response;

public class WSUtils {
    private static final Gson gson = new Gson();
    //Initialisation de l'ObjectBox
    private static Box<Devoir> devoirBox;
    private static Box<Note> noteBox;
    private static Box<Etudiant> etudiantBox;

    public static ArrayList<DevoirVo> getMesDevoirs() throws Exception {
        Response response = OKHttpUtils.sendGetOkHttpRequest(Constantes.MES_DEVOIRS_URL);
        if(response.code()!= HttpsURLConnection.HTTP_OK){
            throw new Exception("Réponse du serveur incorrecte :" + response.code());
        } else {
            InputStreamReader inputStreamReader = new InputStreamReader(response.body().byteStream());
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            JSONArray resp = new JSONArray(InputStreamToString(inputStreamReader));
            ArrayList<DevoirVo> devoirVos = gson.fromJson(resp.toString(), new TypeToken<ArrayList<DevoirVo>>(){}.getType());
            inputStreamReader.close();

            if(devoirVos != null && !devoirVos.isEmpty()){
                Transformer devoirModelTransformer = new Transformer
                        .Builder()
                        .build(DevoirVo.class);
                //Initialisation de la box pour devoir
                devoirBox = ObjectBox.get().boxFor(Devoir.class);

                //Vidage de notre devoirBox
                devoirBox.removeAll();
                //Boucler sur la liste
                for(DevoirVo devoirVo:devoirVos){
                    if(devoirVo != null){
                        //Converting your Model objects to your Domain objects.
                        Devoir devoirTosave = (Devoir) devoirModelTransformer.transform(devoirVo);

                        //Enregistrer les données dans notre devoirBox
                        devoirBox.put(devoirTosave);
                    }
                }
            }

            Log.e("Mes Devoirs téléchargés", devoirVos.toString());
            //Retoruner les données récupérées
            return devoirVos;
        }
    }

    public static ArrayList<NoteVo> getMesNotes() throws Exception {
        Response response = OKHttpUtils.sendGetOkHttpRequest(Constantes.MES_DEVOIRS_URL);
        if(response.code()!= HttpsURLConnection.HTTP_OK){
            throw new Exception("Réponse du serveur incorrecte :" + response.code());
        } else {
            InputStreamReader inputStreamReader = new InputStreamReader(response.body().byteStream());
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            JSONArray resp = new JSONArray(InputStreamToString(inputStreamReader));
            ArrayList<NoteVo> noteVos = gson.fromJson(resp.toString(), new TypeToken<ArrayList<NoteVo>>(){}.getType());
            inputStreamReader.close();

            if(noteVos != null && !noteVos.isEmpty()){
                Transformer noteModelTransformer = new Transformer
                        .Builder()
                        .build(NoteVo.class);
                //Initialisation de la box pour note
                noteBox = ObjectBox.get().boxFor(Note.class);

                //Vidage de notre noteBox
                noteBox.removeAll();
                //Boucler sur la liste
                for(NoteVo noteVo:noteVos){
                    if(noteVo != null){
                        //Converting your Model objects to your Domain objects.
                        Note noteTosave = (Note) noteModelTransformer.transform(noteVo);

                        //Enregistrer les données dans notre noteBox
                        noteBox.put(noteTosave);
                    }
                }
            }

            Log.e("Mes Notes téléchargés",noteVos.toString());
            //Retoruner les données récupérées
            return noteVos;
        }
    }

    public static ArrayList<EtudiantVo> getTousLesEtudiants() throws Exception {
        Response response = OKHttpUtils.sendGetOkHttpRequest(Constantes.TOUS_LES_ETUDIANTS_URL);
        if(response.code()!= HttpsURLConnection.HTTP_OK){
            throw new Exception("Réponse du serveur incorrecte :" + response.code());
        } else {
            InputStreamReader inputStreamReader = new InputStreamReader(response.body().byteStream());
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            JSONArray resp = new JSONArray(InputStreamToString(inputStreamReader));
            ArrayList<EtudiantVo> etudiantVos = gson.fromJson(resp.toString(), new TypeToken<ArrayList<EtudiantVo>>(){}.getType());
            inputStreamReader.close();

            if(etudiantVos != null && !etudiantVos.isEmpty()){
                Transformer etudiantModelTransformer = new Transformer
                        .Builder()
                        .build(EtudiantVo.class);
                //Initialisation de la box pour note
                etudiantBox = ObjectBox.get().boxFor(Etudiant.class);

                //Vidage de notre noteBox
                noteBox.removeAll();
                //Boucler sur la liste
                for(EtudiantVo etudiantVo:etudiantVos){
                    if(etudiantVo != null){
                        //Converting your Model objects to your Domain objects.
                        Etudiant etudiantTosave = (Etudiant) etudiantModelTransformer.transform(etudiantVo);

                        //Enregistrer les données dans notre noteBox
                        etudiantBox.put(etudiantTosave);
                    }
                }
            }

            Log.e("Les Etudiants téléchargés::",etudiantVos.toString());
            //Retoruner les données récupérées
            return etudiantVos;
        }
    }

    public static  String InputStreamToString(InputStreamReader inputStream) {
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader reader = null;

        for (; ; ) {
            int compte = 0;
            try {
                //     compte = reader.read(buffer, 0, buffer.length);
                compte = inputStream.read(buffer, 0, buffer.length);
            } catch (IOException e) {
                // Todo
            }
            if (compte < 0)
                break;
            out.append(buffer, 0, compte);
        }
        try {
            inputStream.close();
        } catch (IOException e) {

            Log.e("TAG","Here, probleme found " );
        }

        return out.toString();
    }
}
