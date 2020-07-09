package com.nedev.eboko.services;

import android.os.AsyncTask;

public class GetMesDevoirsAT extends AsyncTask {

    @Override
    protected Object doInBackground(Object[] objects) {

        try {
            WSUtils.getMesDevoirs();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
