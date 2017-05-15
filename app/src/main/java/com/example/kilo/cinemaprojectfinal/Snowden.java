package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Snowden extends AppCompatActivity {

    ImageView image;
    Button buytickets;
    TextView genre, imdb, length, synopsis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);

        image = (ImageView)findViewById(R.id.imageView);
        genre = (TextView) findViewById(R.id.genre);
        imdb = (TextView) findViewById(R.id.imdb);
        length = (TextView) findViewById(R.id.length);
        synopsis = (TextView) findViewById(R.id.synopsis);
        buytickets = (Button)findViewById(R.id.button2);

        buytickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Snowden.this,SeatSelection.class);
                intent.putExtra("movieName","Snowden");
                startActivity(intent);
            }
        });

        image.setImageResource(R.mipmap.movie2);
        genre.setText("Drama/Thriller");
        imdb.setText("7.8/10");
        length.setText("134 min");
        synopsis.setText(" CIA employee Edward Snowden leaks thousands of classified " +
                "documents to the press");

    }
    public void watchTrailer(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.youtube.com/watch?v=9KyltHXrxVk"));
        startActivity(intent);
    }
}
