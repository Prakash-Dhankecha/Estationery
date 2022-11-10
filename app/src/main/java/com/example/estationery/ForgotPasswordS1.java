package com.example.estationery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPasswordS1 extends AppCompatActivity {

    EditText forgetEmail;
    Button btn_forget_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_s1);

        forgetEmail = findViewById(R.id.forgetEmail);
        btn_forget_pass = findViewById(R.id.btn_forget_pass);

        btn_forget_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPasswordS1.this, ForgotPasswordS2.class);
                startActivity(intent);
            }
        });
    }
}