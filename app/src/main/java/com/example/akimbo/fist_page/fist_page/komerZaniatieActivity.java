package com.example.akimbo.fist_page.fist_page;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.akimbo.R;

public class komerZaniatieActivity extends AppCompatActivity {


    private ListView listView;
    private TextView backPok;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komer_zaniatie);

        listView = findViewById(R.id.listView);

        backPok = findViewById(R.id.backPok);

        final String[] zaniatie = new String[] {
                "Занятие 1", "Занятие 2", "Занятие 3", "Занятие 4", "Занятие 5",
                "Занятие 6", "Занятие 7", "Занятие 8", "Занятие 9", "Занятие 10",
                "Занятие 11", "Занятие 12", "Занятие 13", "Занятие 14", "Занятие 15",
                "Занятие 16", "Занятие 17", "Занятие 18", "Занятие 19", "Занятие 20"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, zaniatie);
        listView.setAdapter(adapter);

        backPok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(komerZaniatieActivity.this, framActivity.class);
                startActivity(intent);
            }
        });
    }
}