package com.nedev.eboko.services;

import android.util.Log;



import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OKHttpUtils {
    public static Response sendGetOkHttpRequest (String url) throws  Exception{
        Log.w("TAG_URL",url);
        OkHttpClient client =new OkHttpClient();
        // Gestion time out avant recuperation
        OkHttpClient clientTimeOut = client.newBuilder()
                .readTimeout(500, TimeUnit.MILLISECONDS)
                .build();

        //Creation de la requete
        Request request = new Request.Builder().url(url).build();

        //Execution de la requete
        return  clientTimeOut.newCall(request).execute();
    }
}
