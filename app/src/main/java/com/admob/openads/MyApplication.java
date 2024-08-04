package com.admob.openads;

import android.app.Application;

import com.admob.admob_open_ads.AppOpenManager;
import com.google.android.gms.ads.MobileAds;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this);

        new AppOpenManager(this, "ca-app-pub-3940256099942544/3419835294");

    }

}
