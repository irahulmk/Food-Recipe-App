package com.example.worcipe20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    TextView name,email,phone,full_name,full_email;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        name=(TextView)findViewById(R.id.name);
        email=(TextView)findViewById(R.id.email);
        phone=(TextView)findViewById(R.id.phone);
        full_name=(TextView)findViewById(R.id.fullname_field);
        full_email=(TextView)findViewById(R.id.username_field);
        update=(Button)findViewById(R.id.update);

        showAllUserData();
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });

    }
    private void showAllUserData() {
        Intent intent = getIntent();
        String user_name = intent.getStringExtra("name");
        String user_email = intent.getStringExtra("email");
        String user_phoneNo = intent.getStringExtra("phone");

        name.setText(user_name);
        full_name.setText(user_name);
        full_email.setText(user_email);
        email.setText(user_email);
        phone.setText(user_phoneNo);
    }

    public void openactivity2(){
        Intent intent = new Intent(getApplicationContext(),dashboard.class);
        startActivity(intent);
    }
}

