package com.example.easychat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    EditText editTextName;
    EditText editTextPhone;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextPhone = findViewById(R.id.editTextSDT);
        editTextName = findViewById(R.id.editTextTen);
        button = findViewById(R.id.buttonDangNhap);

    }

    public void dang_nhap(View view) {
        String name = editTextName.getText().toString();
        String phone = editTextPhone.getText().toString();

    }
}