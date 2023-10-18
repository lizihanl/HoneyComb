package com.example.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button ToImage = findViewById(R.id.toImage);
        ToImage.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });
    }






}