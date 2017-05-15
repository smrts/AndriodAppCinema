package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView movie1,movie2,movie3,movie4,movie5,movie6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie1 = (ImageView)findViewById(R.id.movie1);
        movie2 = (ImageView)findViewById(R.id.movie2);
        movie3 = (ImageView)findViewById(R.id.movie3);
        movie4 = (ImageView)findViewById(R.id.movie4);
        movie5 = (ImageView)findViewById(R.id.movie5);
        movie6 = (ImageView)findViewById(R.id.movie6);

        movie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,InsideOut.class);
                startActivity(intent);
            }
        });

        movie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Zootopia.class);
                startActivity(intent);
            }
        });

        movie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Snowden.class);
                startActivity(intent);
            }
        });

        movie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Interstellar.class);
                startActivity(intent);
            }
        });

        movie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BatVsSuper.class);
                startActivity(intent);
            }
        });

        movie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TwelveYears.class);
                startActivity(intent);
            }
        });
    }
}
