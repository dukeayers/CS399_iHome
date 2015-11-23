package com.example.momurder.ihomeapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Lights extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);

        Button buttonOn = (Button) findViewById(R.id.buttonOn);
        buttonOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOnMessage();

            }
        });

        Button buttonOff = (Button) findViewById(R.id.buttonOff);
        buttonOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOffMessage();

            }
        });

        Button buttonDim = (Button) findViewById(R.id.buttonDim);
        buttonDim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDimMessage();

            }
        });
    }

    private void showOnMessage() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lights.this);
        dialogBuilder.setMessage("Your Lights Have been turned ON!");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }
    private void showOffMessage() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lights.this);
        dialogBuilder.setMessage("Your Lights Have been turned OFF!");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }
    private void showDimMessage() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Lights.this);
        dialogBuilder.setMessage("Your Lights Have been dimmed to 50%");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }
}


