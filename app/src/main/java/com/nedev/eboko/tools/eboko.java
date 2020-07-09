package com.nedev.eboko.tools;

import android.app.Application;

import com.nedev.eboko.models.entities.Devoir;
import com.nedev.eboko.models.entities.Etudiant;
import com.nedev.eboko.models.entities.Note;
import com.nedev.eboko.services.GetLesEtudiants;
import com.nedev.eboko.services.GetMesDevoirsAT;
import com.nedev.eboko.services.GetMesNotes;

import io.objectbox.Box;

public class eboko extends Application {
    private static Box<Devoir> devoirBox;

    private static Box<Note> noteBox;

    private static Box<Etudiant> etudiantBox;

    @Override
    public void onCreate() {
        super.onCreate();
        ObjectBox.init(this);

        devoirBox = ObjectBox.get().boxFor(Devoir.class);
        noteBox = ObjectBox.get().boxFor(Note.class);
        etudiantBox = ObjectBox.get().boxFor(Etudiant.class);

        if(ConnexionDetector.isConnected(getApplicationContext())){
            new GetMesDevoirsAT();
            new GetMesNotes();
            if(etudiantBox.count() == 0){
                new GetLesEtudiants();
            }
        }
    }
}
