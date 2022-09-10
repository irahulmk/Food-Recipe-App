package com.example.worcipe20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {

    Button button3;
    Button Login;
    EditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //getSupportActionBar().hide();
        edit1 = (EditText)findViewById(R.id.editText);
        edit2 = (EditText)findViewById(R.id.editText2);
        button3 = (Button) findViewById(R.id.not);
        Login = (Button)findViewById(R.id.reg);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser(v);
            }
        });
    }

    private Boolean validatePhoneNo() {
        String val = edit2.getText().toString();

        if (val.isEmpty()) {
            edit2.setError("Field cannot be empty");
            return false;
        } else {
            edit2.setError(null);
            return true;
        }
    }

    private Boolean validatePassword() {
        String val = edit2.getText().toString();
        if (val.isEmpty()) {
            edit2.setError("Field cannot be empty");
            return false;
        } else {
            edit2.setError(null);
            return true;
        }
    }

    public void loginUser(View view) {
        //Validate Login Info
        if (!validatePhoneNo() | !validatePassword()) {
            return;
        } else {
            isUser();
        }
    }

    private void isUser() {

        final String userEnteredPhone = edit1.getText().toString();
        final String userEnteredPassword = edit2.getText().toString();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkUser = reference.orderByChild("phone").equalTo(userEnteredPhone);
        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    edit1.setError(null);
                    String passwordFromDB = dataSnapshot.child(userEnteredPhone).child("password").getValue(String.class);
                    assert passwordFromDB != null;
                    if (passwordFromDB.equals(userEnteredPassword)) {
                        edit1.setError(null);
                        String nameFromDB = dataSnapshot.child(userEnteredPhone).child("name").getValue(String.class);
                        String phoneNoFromDB = dataSnapshot.child(userEnteredPhone).child("phone").getValue(String.class);
                        String emailFromDB = dataSnapshot.child(userEnteredPhone).child("email").getValue(String.class);
                        Intent intent = new Intent(getApplicationContext(), UserProfile.class);
                        intent.putExtra("name", nameFromDB);
                        intent.putExtra("email", emailFromDB);
                        intent.putExtra("phone", phoneNoFromDB);
                        startActivity(intent);
                        //openactivity3();

                    } else {

                        edit2.setError("Wrong Password");
                        edit2.requestFocus();
                    }
                } else {

                    edit1.setError("No such Phone no. exists");
                    edit1.requestFocus();
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError){

            }
        });
    }

    public void openactivity2(){
        Intent intent = new Intent(getApplicationContext(),signup.class);
        startActivity(intent);
    }
    public void openactivity3(){
        Intent intent = new Intent(getApplicationContext(),firstscreen.class);
        startActivity(intent);
    }
}

