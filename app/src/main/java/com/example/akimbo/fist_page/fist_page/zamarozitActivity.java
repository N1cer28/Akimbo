package com.example.akimbo.fist_page.fist_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.akimbo.R;

public class zamarozitActivity extends AppCompatActivity {

    private TextView backPok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamarozit);

        backPok = findViewById(R.id.backPok);


        backPok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zamarozitActivity.this, framActivity.class);
                startActivity(intent);
            }
        });
    }
}