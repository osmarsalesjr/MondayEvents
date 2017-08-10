package com.example.convidado.mondayevents.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.convidado.mondayevents.R;

public class AddOwnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_owner);
    }

    protected void addOwner(){
        Toast.makeText(this, "Add a Owner", Toast.LENGTH_SHORT);
    }
}
