package com.example.worcipe20;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class firstscreen extends AppCompatActivity {

    Button contact,settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);

        //setting the title
        toolbar.setTitle("My Toolbar");

        //placing toolbar in place of actionbar
        //setSupportActionBar(toolbar);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity3();
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    public void openactivity1(){
        Intent intent = new Intent(getApplicationContext(),home.class);
    startActivity(intent);
    }

    public void openactivity3(){
        Intent intent = new Intent(getApplicationContext(),dashboard.class);
        startActivity(intent);
    }


}