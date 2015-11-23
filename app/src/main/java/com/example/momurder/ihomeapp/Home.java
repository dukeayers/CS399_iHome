package com.example.momurder.ihomeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {
    EditText userTest;
    UserLocalStore userLocalStore;
    ImageButton buttonLights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonLights = (ImageButton)findViewById(R.id.Lights);
        buttonLights.setOnClickListener(this);

                //String name = userLocalStore.getLoggedInUser().name;

        //userTest =  (EditText) findViewById(R.id.userTest);
        //userTest.setText(name);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "You download is resumed", Toast.LENGTH_LONG).show();
    }

}
