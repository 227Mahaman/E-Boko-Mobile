package com.nedev.eboko.tools;

import android.content.Context;
import android.util.Log;

import com.nedev.eboko.models.entities.MyObjectBox;

import io.objectbox.BoxStore;
import io.objectbox.android.AndroidObjectBrowser;

public class ObjectBox {
    private static BoxStore boxStore;

    public static void init(Context context){
        boxStore = MyObjectBox.builder().androidContext(context.getApplicationContext()).build();

        boolean started = new AndroidObjectBrowser(boxStore).start(context);
        Log.i("ObjectBrowser", "Started: " + started);
    }

    public static  BoxStore get() {return boxStore;}
}
