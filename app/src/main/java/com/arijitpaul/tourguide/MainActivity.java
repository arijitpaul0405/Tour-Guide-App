package com.arijitpaul.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button attraction, restaurant, cuisine, festival, bestSecret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        attraction = findViewById(R.id.attraction_button);
        restaurant = findViewById(R.id.restaurant_button);
        cuisine = findViewById(R.id.cuisine_button);
        festival = findViewById(R.id.festival_button);
        bestSecret = findViewById(R.id.best_secret_button);

        attraction.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AttractionActivity.class);
            startActivity(intent);
        });

        restaurant.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
            startActivity(intent);
        });

        cuisine.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CuisineActivity.class);
            startActivity(intent);
        });

        festival.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FestivalActivity.class);
            startActivity(intent);
        });

        bestSecret.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BestSecretActivity.class);
            startActivity(intent);
        });

    }
}