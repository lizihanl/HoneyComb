package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toFlight = findViewById(R.id.checkFlight);
        toFlight.setTextColor(Color.parseColor("black"));
        toFlight.setBackgroundColor(Color.parseColor("cyan"));
        toFlight.setOnClickListener(view -> {
            Intent intent = new Intent(this, Flight_Activity.class);
            startActivity(intent);
        });

        Button toWeather = findViewById(R.id.checkWeather);
        toWeather.setTextColor(Color.parseColor("black"));
        toWeather.setBackgroundColor(Color.parseColor("magenta"));
        toWeather.setOnClickListener(view -> {
            Intent intent = new Intent(this, Weather_Activity.class);
            startActivity(intent);
        });

        Button toRisk = findViewById(R.id.checkRisk);
        toRisk.setTextColor(Color.parseColor("black"));
        toRisk.setBackgroundColor(Color.parseColor("yellow"));
        toRisk.setOnClickListener(view -> {
            Intent intent = new Intent(this, Risk_Activity.class);
            startActivity(intent);
        });

        Button toPinnedFlight = findViewById(R.id.checkPinnedFlight);
        toPinnedFlight.setTextColor(Color.parseColor("black"));
        toPinnedFlight.setBackgroundColor(Color.parseColor("cyan"));
        toPinnedFlight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                replaceFragment(new Fragment1());
            }
        });

        Button toPinnedWeather = findViewById(R.id.checkPinnedWeather);
        toWeather.setTextColor(Color.parseColor("black"));
        toWeather.setBackgroundColor(Color.parseColor("magenta"));
        toPinnedWeather.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                replaceFragment(new Fragment2());
            }
        });

        Button toProfilePage = findViewById(R.id.ProfilePage);
        toProfilePage.setTextColor(Color.parseColor("black"));
        toProfilePage.setBackgroundColor(Color.parseColor("Red"));
        toProfilePage.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });

    }

    private void replaceFragment(Fragment f){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.flFragment, f);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}