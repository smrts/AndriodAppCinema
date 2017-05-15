package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BatVsSuper extends AppCompatActivity {

    ImageView image;
    TextView genre, imdb, length, synopsis;
    Button buytickets;
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
                Intent intent = new Intent(BatVsSuper.this,SeatSelection.class);
                intent.putExtra("movieName","Batman Vs Superman");
                startActivity(intent);
            }
        });

        image.setImageResource(R.mipmap.movie5);
        genre.setText("Action/Adventure/Fantasy");
        imdb.setText("7/10");
        length.setText("151 min");
        synopsis.setText("Fearing the actions of a god-like Super Hero left " +
                "unchecked, Gotham City's own formidable, forceful vigilante takes " +
                "on Metropolis's most revered, modern-day savior, while the world " +
                "wrestles with what sort of hero it really needs. And with Batman " +
                "and Superman at war with one another, a new threat quickly arises, " +
                "putting mankind in greater danger than it's ever known before.");

    }
    public void watchTrailer(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.youtube.com/watch?v=eX_iASz1Si8"));
        startActivity(intent);
    }
}
