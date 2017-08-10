package com.example.convidado.mondayevents.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.convidado.mondayevents.R;

public class CreateEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
    }

    protected void createEvent(){
        Toast.makeText(this, "Create a Event", Toast.LENGTH_SHORT);
    }
}
