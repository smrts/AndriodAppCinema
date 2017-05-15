package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InsideOut extends AppCompatActivity {

    ImageView image;
    private TextView genre, imdb, length, synopsis;
    private Button buytickets;
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
                Intent intent = new Intent(InsideOut.this,SeatSelection.class);
                intent.putExtra("movieName","Inside Out");
                startActivity(intent);
            }
        });

        image.setImageResource(R.mipmap.movie1);
        genre.setText("Animation/Comedy/Family");
        imdb.setText("8.1/10");
        length.setText("94 min");
        synopsis.setText("Growing up can be a bumpy road, and it's no exception for Riley," +
                "who is up rooted from her Midwest life when her father starts a new job in" +
                "San Francisco. Like all of us, Riley is guided by her emotions - Joy,Fear,Anger," +
                "Disgust and Sadness. The emotions live in Headquarters, the control center inside" +
                "Riley's mind, where they help advise her through everyday life. As Riley" +
                "and her emotions struggle to adjust to a new life in San Francisco, turmoil" +
                "ensues in Headquarters. Although Joy, Riley's main and most important emotion," +
                " tries to keep things positive, the emotions conflict on how best to navigate" +
                "a new city, house and school.");
    }

    public void watchTrailer(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.youtube.com/watch?v=seMwpP0yeu4"));
        startActivity(intent);
    }
}
