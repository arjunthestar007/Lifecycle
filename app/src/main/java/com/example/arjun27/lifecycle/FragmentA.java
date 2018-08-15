package com.example.arjun27.lifecycle;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    TextView textview;
    Button button,button3;
    EditText editText;
    private static final String TAG = "FragmentA";


    public static FragmentA newInstance() {
        
        Bundle args = new Bundle();

        FragmentA fragment = new FragmentA();
        fragment.setArguments(args);
        return fragment;
    }
    
    public FragmentA() {
        // Required empty public constructor
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
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        Mylog.print(TAG,"onCreateView");
        textview=view.findViewById(R.id.text);
        editText=view.findViewById(R.id.editText);
        button=view.findViewById(R.id.button);
        button3=view.findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentB fragmentB =FragmentB.newInstance();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                fragmentTransaction2.replace(R.id.container, fragmentB);
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               textview.setText(editText.getText().toString());
            }
        });



        return view;
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
