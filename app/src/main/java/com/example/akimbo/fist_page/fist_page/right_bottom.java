package com.example.akimbo.fist_page.fist_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.akimbo.R;

public class right_bottom extends AppCompatActivity {
    private ListView listView1;
    private TextView backPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_bottom);

        listView1 = findViewById(R.id.listView1);

        backPos = findViewById(R.id.backPos);

        final String[] poseckenie = new String[] {
                "Посещение 1", "Посещение 2", "Посещение 3", "Посещение 4", "Посещение 5",
                "Посещение 6", "Посещение 7", "Посещение 8", "Посещение 9", "Посещение 10",
                "Посещение 11", "Посещение 12", "Посещение 13", "Посещение 14", "Посещение 15",
                "Посещение 16", "Посещение 17", "Посещение 18", "Посещение 19", "Посещение 20"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, poseckenie);
        listView1.setAdapter(adapter);

        backPos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(right_bottom.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}