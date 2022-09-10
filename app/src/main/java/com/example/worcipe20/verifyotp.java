package com.example.worcipe20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.executor.TaskExecutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD;
import static com.google.firebase.auth.PhoneAuthProvider.*;

public class verifyotp extends AppCompatActivity {
    String CodeBySystem;
    Button verify;
    EditText Phoneno;
    ProgressBar p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifyotp);

        verify = findViewById(R.id.button);
        Phoneno = findViewById(R.id.editText9);
        p = findViewById(R.id.progressBar);
        p.setVisibility(View.GONE);

        final String phone = getIntent().getStringExtra("phone");
        sendVerificationCodeToUser(phone);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = Phoneno.getText().toString();
                if (code.isEmpty() || code.length() < 6) {
                    Phoneno.setError("Wrong OTP!");
                    Phoneno.requestFocus();
                    return;
                }
                p.setVisibility(View.VISIBLE);
                verifyCode(code);
            }
        });
    }

    private void sendVerificationCodeToUser(String phone) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+91" + phone,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,
                verifyotp.this,
                mCallbacks);
        Toast.makeText(getApplicationContext(), "number sent" + phone, Toast.LENGTH_SHORT).show();
    }

    private OnVerificationStateChangedCallbacks mCallbacks = new OnVerificationStateChangedCallbacks() {

        @Override
        public void onCodeSent(@NonNull String s, @NonNull ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            CodeBySystem = s;
        }

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
            String code = phoneAuthCredential.getSmsCode();
            if (code != null) {
                p.setVisibility(View.VISIBLE);
                verifyCode(code);
            }
        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Toast.makeText(verifyotp.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    };

    private void verifyCode(String codebyuser) {
        PhoneAuthCredential credential = getCredential(CodeBySystem, codebyuser);
        signintheuserbycredentials(credential);
    }

    private void signintheuserbycredentials(PhoneAuthCredential credential) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(verifyotp.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent in = new Intent(getApplicationContext(), login.class);
                            getIntent().setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(in);
                            finish();
                        } else {
                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                Toast.makeText(verifyotp.this, "Verification Not Completed! Try again.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

    }
}
