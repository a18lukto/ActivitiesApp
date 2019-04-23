package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class detaljer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaljer);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String mountname = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String mountlocation = intent.getStringExtra(MainActivity.EXTRA_LOCATION);
        String mountheight = intent.getStringExtra(MainActivity.EXTRA_HEIGHT);
        Log.d("a18lukto", "Fick följande från main activitt: "+mountname );

        TextView headerView = findViewById(R.id.textDetaljerHeader);
        headerView.setText(mountname);

        TextView textView1 = findViewById(R.id.textDetaljerText);
        textView1.setText(mountlocation);

        TextView textView2 = findViewById(R.id.textDetaljerText2);
        textView2.setText(mountheight);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
