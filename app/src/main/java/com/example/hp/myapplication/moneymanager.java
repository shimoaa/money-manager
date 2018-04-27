package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class moneymanager extends AppCompatActivity {
    Button minus;
    Button plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moneymanager);

        minus = findViewById(R.id.minus);
        minus .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(moneymanager.this,minus.class));
            }
        });

        plus = findViewById(R.id.plus);
        plus .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(moneymanager.this,plus.class));
            }
        });
    }
}
