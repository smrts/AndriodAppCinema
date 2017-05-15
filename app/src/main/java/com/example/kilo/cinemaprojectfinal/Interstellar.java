package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Interstellar extends AppCompatActivity {

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
                Intent intent = new Intent(Interstellar.this,SeatSelection.class);
                intent.putExtra("movieName","Interstellar");
                startActivity(intent);
            }
        });

        image.setImageResource(R.mipmap.movie4);
        genre.setText("Science-Fiction/Drama/Adventure");
        imdb.setText("8.4/10");
        length.setText("169 min");
        synopsis.setText("Interstellar chronicles the adventures of a group of " +
                "explorers who make use of a newly discovered wormhole to surpass the " +
                "limitations on human space travel and conquer the vast distances involved" +
                "in an interstellar voyage");

    }
    public void watchTrailer(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.youtube.com/watch?v=zSWdZVtXT7E"));
        startActivity(intent);
    }
}
