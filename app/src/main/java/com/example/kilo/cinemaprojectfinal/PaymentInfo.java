package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PaymentInfo extends AppCompatActivity {

    TextView grandTotal, seatsTotal, numPop, numDrinks;

    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_info);

        confirm = (Button)findViewById(R.id.confirmButton);
        grandTotal = (TextView)findViewById(R.id.grandTotal);
        seatsTotal = (TextView)findViewById(R.id.seatsPrice);
        numDrinks = (TextView)findViewById(R.id.numDrinks);
        numPop = (TextView)findViewById(R.id.numPop);

        float firstTotal = getIntent().getFloatExtra("firstTotal", 0);
        float secondTotal = getIntent().getFloatExtra("secondTotal", 0);
        int counter1 = getIntent().getIntExtra("popValue",0);
        int counter2 = getIntent().getIntExtra("drinkValue",0);
        final String movieName = getIntent().getStringExtra("movieName");
        final float totalseat = getIntent().getFloatExtra("totalseat",0);

        final float fullTotal = firstTotal + secondTotal;

        seatsTotal.setText(Float.toString(firstTotal));
        grandTotal.setText(Float.toString(fullTotal));
        numPop.setText(Integer.toString(counter1));
        numDrinks.setText(Integer.toString(counter2));

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentInfo.this,PaymentMethod.class);
                startActivity(intent);
                savetoPHP(movieName,totalseat,fullTotal);
            }
        });
    }
    public void savetoPHP(String movieName, float totalseat, float fullTotal)
    {
        final String url = "http://10.5.14.79/cinema_project/TEST.php?MovieName="+movieName+"&Seats="+totalseat+"&TotalPrice="+fullTotal;
        class DisplayHello extends AsyncTask<String, Void, String>
        {
            @Override //thsi method used or before execute the command in the mobile app
            protected void onPreExecute()
            {
                super.onPreExecute();
            }
            @Override //return results from php to the mobile app
            protected void onPostExecute(String s)
            {
                super.onPostExecute(s);
                
                //edit.setText(s);
            }

            @Override //used during mobile app running the process
            protected String doInBackground(String...params)
            {
                String url = params[0]; //params[0] is the data for url
                BufferedReader bf = null;

                try //link to network, so you need to of the exception
                {
                    URL urls = new URL(url);
                    HttpURLConnection connection = (HttpURLConnection)urls.openConnection();
                    bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    String results = bf.readLine();
                    return results;
                }
                catch(Exception e)
                {
                    return "OOPSY!";
                }
            }
        }
        DisplayHello display = new DisplayHello();
        display.execute(url); //jump to doInBackground()
    }

}
