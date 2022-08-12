package com.example.imageclassifier;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView paper;
    private ImageView can;
    private ImageView glass;
    private ImageView plastic;
    private ImageView styrofoam;
    private ImageView plastic_bag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paper = (ImageView)findViewById(R.id.main_paper);
        can = (ImageView)findViewById(R.id.main_can);
        glass = (ImageView)findViewById(R.id.main_glass);
        plastic = (ImageView)findViewById(R.id.main_plastic);
        styrofoam = (ImageView)findViewById(R.id.main_plastic_bottle);
        plastic_bag = (ImageView)findViewById(R.id.main_plastic_bag);

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PaPer.class);
                startActivity(intent);
            }
        });
        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Can.class);
                startActivity(intent);

            }
        });


        glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Glassbottle.class);
                startActivity(intent);

            }
        });


        plastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Plastic.class);
                startActivity(intent);

            }
        });



        styrofoam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Styrofoam.class);
                startActivity(intent);

            }
        });


        plastic_bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Plasticbag.class);
                startActivity(intent);

            }
        });



        Button galleryBtn = findViewById(R.id.galleryBtn);
        galleryBtn.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, GalleryActivity.class);
            startActivity(i);
        });

        Button cameraBtn = findViewById(R.id.cameraBtn);
        cameraBtn.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, CameraActivity.class);
            startActivity(i);
        });
    }
}