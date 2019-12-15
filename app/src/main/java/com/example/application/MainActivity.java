package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView image_1,image_2,image_3,image_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_1  =findViewById(R.id.image_1);
        image_2  = findViewById(R.id.image_2);
        image_3  = findViewById(R.id.image_3);
        image_4  = findViewById(R.id.image_4);

        image_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,news.class));
            }
        });
        image_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,HealthyActivity.class));
            }
        });
        image_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FoodActivity.class));
            }
        });
        image_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
            }
        });

    }



}

