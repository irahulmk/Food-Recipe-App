package com.example.worcipe20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    Button button2,regtolog;
    EditText text1,text2,text3,text4;

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //getSupportActionBar().hide();
        button2 = (Button) findViewById(R.id.reg);
        regtolog = (Button) findViewById(R.id.not);
        text1 = (EditText)findViewById(R.id.editText);
        text2 = (EditText)findViewById(R.id.editText2);
        text3 = (EditText)findViewById(R.id.editText3);
        text4 = (EditText)findViewById(R.id.editText4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference= rootNode.getReference("users");
                registerUser(v);

            }
        });

        regtolog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });


    }

    private Boolean validateName() {
        String val = text3.getText().toString();

        if (val.isEmpty()) {
            text3.setError("Field cannot be empty");
            return false;
        }
        else {
            text3.setError(null);
            return true;
        }
    }

    private Boolean validateEmail() {
        String val = text1.getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (val.isEmpty()) {
            text1.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(emailPattern)) {
            text1.setError("Invalid email address");
            return false;
        } else {
            text1.setError(null);
            return true;
        }
    }

    private Boolean validatePhoneNo() {
        String val = text4.getText().toString();

        if (val.isEmpty()) {
            text4.setError("Field cannot be empty");
            return false;
        } else {
            text4.setError(null);
            return true;
        }
    }

    private Boolean validatepass() {
        String val = text2.getText().toString();

        String passwordVal = "^" +
                //"(?=.*[0-9])" +         //at least 1 digit
                //"(?=.*[a-z])" +         //at least 1 lower case letter
                //"(?=.*[A-Z])" +         //at least 1 upper case letter
                "(?=.*[a-zA-Z])" +      //any letter
                "(?=.*[@#$%^&+=])" +    //at least 1 special character
                "(?=\\S+$)" +           //no white spaces
                ".{4,}" +               //at least 4 characters
                "$";

        if (val.isEmpty()) {
            text2.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(passwordVal)) {
            text2.setError("Password is too weak");
            return false;
        } else {
            text2.setError(null);
            return true;
        }
    }




    public void openactivity1(){
        Intent intent = new Intent(getApplicationContext(),login.class);
        startActivity(intent);
    }

    public void openactivity2(){
        Intent intent = new Intent(getApplicationContext(),login.class);
        startActivity(intent);
    }

    public void registerUser(View view){
        if(!validateName() |!validatepass() |  !validateEmail() | !validatePhoneNo())
        {
            return;
        }
        String email = text1.getText().toString();
        String password = text2.getText().toString();
        String name = text3.getText().toString();
        String phone = text4.getText().toString();

        Userhelperclass helperClass = new Userhelperclass(name, email, password, phone);
        reference.child(phone).setValue(helperClass);

        Intent i = new Intent(getApplicationContext(),verifyotp.class);
        i.putExtra("phone",phone);
        startActivity(i);

        //openactivity1();

    }
}