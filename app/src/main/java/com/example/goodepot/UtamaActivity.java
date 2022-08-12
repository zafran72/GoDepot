package com.example.goodepot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class UtamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

    }

    public void menu(View view) {
        Intent intent = new Intent(UtamaActivity.this, MenuActivity.class);
        startActivity(intent);
    }
}