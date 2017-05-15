package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThankYouPage extends AppCompatActivity {

    Button main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you_page);

        main = (Button)findViewById(R.id.main);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThankYouPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
