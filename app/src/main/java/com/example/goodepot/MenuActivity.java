package com.example.goodepot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void riwayat(View view) {
        Intent intent = new Intent(MenuActivity.this, Riwayat.class);
        startActivity(intent);
    }

    public void order(View view) {
        Intent intent = new Intent(MenuActivity.this, OrderActivity.class);
        startActivity(intent);
    }

    public void exit(View view) {
        moveTaskToBack(true);
    }

    public void about(View view) {
        Intent intent = new Intent(MenuActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}

