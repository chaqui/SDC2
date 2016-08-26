package com.seguidoresdecristo.sdc;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by josueChaqui on 26/08/2016.
 */
public class SDC2app extends Application {
    @Override
    public  void  onCreate(){
            super.onCreate();
            FacebookSdk.sdkInitialize(getApplicationContext());
            AppEventsLogger.activateApp(this);
    }
}
