package com.example.arjun27.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnotherActivity extends AppCompatActivity {
    private static final String TAG = "ActivityB";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Mylog.activityprint(TAG,"onStart");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Mylog.activityprint(TAG,"onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Mylog.activityprint(TAG,"onPause");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Mylog.activityprint(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Mylog.activityprint(TAG,"onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Mylog.activityprint(TAG,"onDestroy");

    }
}
