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

public class left_bottom extends AppCompatActivity {

    private ListView listView;
    private TextView backPok;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_bottom);

        listView = findViewById(R.id.listView);

        backPok = findViewById(R.id.backPok);

        final String[] pokupki = new String[] {
                "Покупка 1", "Покупка 2", "Покупка 3", "Покупка 4", "Покупка 5",
                "Покупка 6", "Покупка 7", "Покупка 8", "Покупка 9", "Покупка 10",
                "Покупка 11", "Покупка 12", "Покупка 13", "Покупка 14", "Покупка 15",
                "Покупка 16", "Покупка 17", "Покупка 18", "Покупка 19", "Покупка 20"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, pokupki);
        listView.setAdapter(adapter);

        backPok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(left_bottom.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}