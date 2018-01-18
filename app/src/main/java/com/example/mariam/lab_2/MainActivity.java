package com.example.mariam.lab_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main Activity","onCreate method called");
    }
    @Override
    protected void  onRestart() {
        super.onRestart();
        Log.i("Main Activity","On restart method caled");
    }
    @Override
    protected void  onStart() {
        super.onStart();
        Log.i("Main Activity","On restart method caled");
    }
    @Override
    protected void  onResume() {
        super.onResume();
        Log.i("Main Activity","On restart method caled");
    }
}
