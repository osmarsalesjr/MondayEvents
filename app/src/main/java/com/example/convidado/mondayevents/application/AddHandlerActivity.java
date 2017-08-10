package com.example.convidado.mondayevents.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.convidado.mondayevents.R;

public class AddHandlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_handler);
    }

    protected void addHandler(){
        Toast.makeText(this, "Add a Handler", Toast.LENGTH_SHORT);
    }
}
