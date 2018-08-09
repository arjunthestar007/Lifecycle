package com.example.arjun27.lifecycle;

import android.util.Log;

public class Mylog {
    private static final String TAG = "Mylog";

    public static void activityprint(String msg){

        Log.d(TAG, "activity: "+msg);
    }

}
