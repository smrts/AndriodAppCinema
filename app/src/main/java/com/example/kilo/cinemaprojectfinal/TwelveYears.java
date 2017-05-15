package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TwelveYears extends AppCompatActivity {

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
                Intent intent = new Intent(TwelveYears.this,SeatSelection.class);
                intent.putExtra("movieName","Twelve Years a Slave");
                startActivity(intent);
            }
        });

        image.setImageResource(R.mipmap.movie6);
        genre.setText("Drama/History");
        imdb.setText("8.1/10");
        length.setText("134 min");
        synopsis.setText("In the pre-Civil war United States, Solomon Northup, " +
                "a free black man from upstate New York, is abducted and sold into " +
                "slavery. Facing cruelty as well as unexptected kindnesses " +
                "Solomon struggles not only to stay alive, but to retain his dignity. " +
                "In the twelfth year of his unforgettable odyssey, Solomon's chance " +
                "meeting with a Canadian abolitionist will forever alter his life.");

    }
    public void watchTrailer(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.youtube.com/watch?v=z02Ie8wKKRg"));
        startActivity(intent);
    }
}
