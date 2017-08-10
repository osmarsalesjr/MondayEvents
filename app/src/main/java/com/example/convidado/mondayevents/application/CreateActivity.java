package com.example.convidado.mondayevents.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.convidado.mondayevents.R;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    protected void createActivity(){

        Toast.makeText(this, "Create a Activity", Toast.LENGTH_SHORT);
    }
}
