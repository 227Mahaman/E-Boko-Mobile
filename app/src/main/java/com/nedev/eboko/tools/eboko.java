package com.nedev.eboko.tools;

import android.app.Application;

import com.nedev.eboko.models.entities.Devoir;
import com.nedev.eboko.models.entities.Note;
import com.nedev.eboko.services.GetMesDevoirsAT;
import com.nedev.eboko.services.GetMesNotes;

import io.objectbox.Box;

public class eboko extends Application {
    private static Box<Devoir> devoirBox;

    private static Box<Note> noteBox;

    @Override
    public void onCreate() {
        super.onCreate();
        ObjectBox.init(this);

        devoirBox = ObjectBox.get().boxFor(Devoir.class);
        noteBox = ObjectBox.get().boxFor(Note.class);

        if(ConnexionDetector.isConnected(getApplicationContext())){
            new GetMesDevoirsAT();
            new GetMesNotes();
        }
    }
}
