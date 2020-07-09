package com.nedev.eboko.services;

import android.os.AsyncTask;

public class GetMesNotes extends AsyncTask {

    @Override
    protected Object doInBackground(Object[] objects) {

        try {
           WSUtils.getMesNotes();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
