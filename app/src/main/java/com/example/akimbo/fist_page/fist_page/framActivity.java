package com.example.akimbo.fist_page.fist_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.akimbo.R;

public class framActivity extends AppCompatActivity {

    private Button prodlit;
    private Button zamor;
    private TextView com_zan;
    private TextView per_zan;
    private TextView zan;
    private TextView backPok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fram);

        prodlit = findViewById(R.id.prodlit);
        zamor = findViewById(R.id.zamor);
        com_zan = findViewById(R.id.com_zan);
        per_zan = findViewById(R.id.per_zan);
        zan = findViewById(R.id.zan);
        backPok = findViewById(R.id.backPok);

        prodlit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(framActivity.this, prodlitActivity.class);
                startActivity(intent);
            }
        });

        zamor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(framActivity.this, zamarozitActivity.class);
                startActivity(intent);
            }
        });

       com_zan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(framActivity.this, komerZaniatieActivity.class);
                startActivity(intent);
            }
        });

        per_zan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(framActivity.this, personZaniatieActivity.class);
                startActivity(intent);
            }
        });

        zan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(framActivity.this, zaniatieActivity.class);
                startActivity(intent);
            }
        });

        backPok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(framActivity.this, zaniatieActivity.class);
                startActivity(intent);
            }
        });
    }
}