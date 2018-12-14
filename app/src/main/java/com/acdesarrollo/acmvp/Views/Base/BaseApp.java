package com.acdesarrollo.acmvp.Views.Base;

import android.app.Application;

import com.acdesarrollo.acmvp.BuildConfig;
import com.acdesarrollo.acmvp.Utils.FileLoggingTree;

public class BaseApp extends Application {

    @Override public void onCreate() {
        super.onCreate();

        //Para configurar Timber
        if (BuildConfig.DEBUG) {
            //Timber.plant(new FileLoggingTree(getApplicationContext()));
        } else {
            //Timber.plant(new FileLoggingTree(getApplicationContext()));
        }
    }

}
