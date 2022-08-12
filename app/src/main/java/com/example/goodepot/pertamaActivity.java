package com.example.goodepot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pertamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertama);
    }

    public void lanjut(View view) {
        Intent intent = new Intent(pertamaActivity.this, pesanActivity.class);
        startActivity(intent);
    }

}