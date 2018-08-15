package com.example.arjun27.lifecycle;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    private static final String TAG = "FragmentB";

    public FragmentB() {
        // Required empty public constructor
    }

    public static FragmentB newInstance() {

        Bundle args = new Bundle();
        
        FragmentB fragment = new FragmentB();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Mylog.print(TAG,"onAttach");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mylog.print(TAG,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_b, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Mylog.print(TAG,"onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Mylog.print(TAG,"onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Mylog.print(TAG,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Mylog.print(TAG,"onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Mylog.print(TAG,"onStop");

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Mylog.print(TAG,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Mylog.print(TAG,"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Mylog.print(TAG,"onDetach");

    }
}
