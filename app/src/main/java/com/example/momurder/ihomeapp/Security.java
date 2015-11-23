package com.example.momurder.ihomeapp;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Security extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);


        Button buttonOn = (Button) findViewById(R.id.cameraON);
        buttonOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCameraON();

            }
        });

        Button buttonOff = (Button) findViewById(R.id.cameraOFF);
        buttonOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCameraOff();

            }
        });

        Button buttonEnable = (Button) findViewById(R.id.alarmEnavle);
        buttonEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showEnable();

            }
        });

        Button buttonDisable = (Button) findViewById(R.id.alarmDisable);
        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDisabled();

            }
        });

        Button buttonLock = (Button) findViewById(R.id.btnLock);
        buttonLock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLock();

            }
        });

        Button buttonUnlock = (Button) findViewById(R.id.btnUnlock);
        buttonUnlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showUnlock();

            }
        });

    }


    private void showCameraON() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Security.this);
        dialogBuilder.setMessage("Security Cameras are ON!");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }

    private void showCameraOff() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Security.this);
        dialogBuilder.setMessage("Security Cameras are OFF!");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }

    private void showLock() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Security.this);
        dialogBuilder.setMessage("All doors are LOCKED!");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }

    private void showUnlock() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Security.this);
        dialogBuilder.setMessage("Doors have been UNLOCKED!");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }

    private void showEnable() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Security.this);
        dialogBuilder.setMessage("HOUSE ALARM ENABLED!");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }

    private void showDisabled() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Security.this);
        dialogBuilder.setMessage("HOUSE ALARM DISABLED");
        dialogBuilder.setPositiveButton("OK", null);
        dialogBuilder.show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_security, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
