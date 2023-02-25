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

public class personZaniatieActivity extends AppCompatActivity {

    private ListView listView;
    private TextView backPok;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_zaniatie);

        listView = findViewById(R.id.listView);

        backPok = findViewById(R.id.backPok);

        final String[] zaniatie = new String[] {
                "Тренировка 1", "Тренировка 2", "Тренировка 3", "Тренировка 4", "Тренировка 5",
                "Тренировка 6", "Тренировка 7", "Тренировка 8", "Тренировка 9", "Тренировка 10",
                "Тренировка 11", "Тренировка 12", "Тренировка 13", "Тренировка 14", "Тренировка 15",
                "Тренировка 16", "Тренировка 17", "Тренировка 18", "Тренировка 19", "Тренировка 20"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, zaniatie);
        listView.setAdapter(adapter);

        backPok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(personZaniatieActivity.this, framActivity.class);
                startActivity(intent);
            }
        });
    }
}