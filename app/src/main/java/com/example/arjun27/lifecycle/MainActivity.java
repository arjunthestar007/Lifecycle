package com.example.arjun27.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ActivityA";
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mylog.print(TAG,"onCreate");

        fragmentManager = getSupportFragmentManager();




    }

    @Override
    protected void onStart() {
        super.onStart();
        Mylog.print(TAG,"onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Mylog.print(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Mylog.print(TAG,"onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Mylog.print(TAG,"onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Mylog.print(TAG,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Mylog.print(TAG,"onDestroy");
    }

    public void anotheractivity(View view) {

        startActivity(new Intent(this,AnotherActivity.class));


    }

    public void addfragment(View view) {


        FragmentA fragmentA=FragmentA.newInstance();
        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();

        fragmentTransaction1.add(R.id.container, fragmentA);
        fragmentTransaction1.addToBackStack("frag");
        fragmentTransaction1.commit();


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Fragment fragment=fragmentManager.findFragmentById(R.id.container);
        if(fragment==null){
            finish();
        }
    }
}
