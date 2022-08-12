package com.example.goodepot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void kembali(View view) {
        Intent intent = new Intent(AboutActivity.this, MenuActivity.class);
        startActivity(intent );
    }
}