package com.example.goodepot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Akang Galon Air Bersih","Depot Air Murni","Endah Murni Galon","Galon Bengkalis","Air Bening","Air sumur Jernih","Cleo Galon","Aquarium Bening","Air Masak","PangkaL Air madura","Jaya Galon","Maju Depot Air","Depot jaya","prasmanan galon air","Kimteng Galon air minum"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), pertamaActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), keduaActivity.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}