package com.web2droid.loginflow;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Harsh on 28-Aug-17.
 */

public class AppPreference {
    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;
    public static String LOGGEDIN = "loggedIn";
    public static AppPreference instance;
    public Context mContext;

    public AppPreference(Context context) {
        mContext = context;
        String prefsFile = context.getPackageName();
        sharedPreferences = context.getSharedPreferences(prefsFile, MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public static AppPreference getPrefsHelper() {
        return instance;
    }


    public void saveLoggedIn(boolean val) {
        editor.putBoolean(LOGGEDIN, val);
        editor.apply();
    }

    public boolean getLoggedIn() {
        return sharedPreferences.getBoolean(LOGGEDIN, false);
    }
}
