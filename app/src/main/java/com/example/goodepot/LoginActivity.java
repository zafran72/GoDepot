package com.example.goodepot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void daftar(View view) {
        Intent intent = new Intent(LoginActivity.this, DaftarActivity.class);
        startActivity(intent);
    }

    public void masuk(View view) {
        Intent intent = new Intent(LoginActivity.this, UtamaActivity.class);
        startActivity(intent);
    }
}