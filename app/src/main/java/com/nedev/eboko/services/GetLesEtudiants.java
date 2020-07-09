package com.nedev.eboko.services;

import android.os.AsyncTask;

public class GetLesEtudiants extends AsyncTask {

    @Override
    protected Object doInBackground(Object[] objects) {

        try {
            WSUtils.getTousLesEtudiants();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
