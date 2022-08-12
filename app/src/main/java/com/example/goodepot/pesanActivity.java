package com.example.goodepot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pesanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
    }

    public void buynow(View view) {
        Intent intent = new Intent(pesanActivity.this, Riwayat.class);
        startActivity(intent);
    }

    public void kembali(View view) {
        Intent intent = new Intent(pesanActivity.this, UtamaActivity.class);
        startActivity(intent);
    }
}