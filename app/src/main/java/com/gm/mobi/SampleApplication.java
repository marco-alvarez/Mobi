package com.gm.mobi;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this);

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        ParseFacebookUtils.initialize(this);

    }
}
