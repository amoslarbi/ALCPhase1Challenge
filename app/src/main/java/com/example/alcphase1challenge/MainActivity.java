package com.example.alcphase1challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button alcbutton, myprofilebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alcbutton = findViewById(R.id.alcbutton);
        myprofilebutton = findViewById(R.id.myprofilebutton);
        getSupportActionBar().setTitle("ALC 4 Phase 1");

        alcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, ActivityB.class);
                startActivity(in);
                finish();
            }
        });

        myprofilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, ActivityC.class);
                startActivity(in);
                finish();
            }
        });


    }


}
