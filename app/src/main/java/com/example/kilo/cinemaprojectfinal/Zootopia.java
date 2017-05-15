package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Zootopia extends AppCompatActivity {

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
                Intent intent = new Intent(Zootopia.this,SeatSelection.class);
                intent.putExtra("movieName","Zootopia");
                startActivity(intent);
            }
        });

        image.setImageResource(R.mipmap.movie3);
        genre.setText("Adventure/Animation/Comedy");
        imdb.setText("8.1/10");
        length.setText("108 min");
        synopsis.setText("Determined to prove herself, Officer Judy Hopps, the first bunny on " +
                "Zootopia's police force, jumps at the chance to crack her first case - " +
                "even if it means partnering with scam-artist fox Nick Wilde to solve the mystery.");
    }

    public void watchTrailer(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.youtube.com/watch?v=jWM0ct-OLsM"));
        startActivity(intent);
    }
}
