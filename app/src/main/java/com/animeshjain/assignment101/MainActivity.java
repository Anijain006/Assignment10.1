package com.animeshjain.assignment101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Implementing FragmentManager Using getFragmentManager
        getFragmentManager().beginTransaction().add(R.id.mainActivity,new simpleAddition()).commit();

    }
}
