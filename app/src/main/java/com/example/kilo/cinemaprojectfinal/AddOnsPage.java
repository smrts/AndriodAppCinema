package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddOnsPage extends AppCompatActivity {

    TextView text1, text2, totalPrice, seatsPreview;
    Button btn1, btn2, btn3, next;
    int counter1 = 0, total = 0,total2 = 0;
    int counter2 = 0;
    float price,price2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ons_page);

        text1 = (TextView)findViewById(R.id.numPop);       //no. of popcorn
        text2 = (TextView)findViewById(R.id.numDrinks);    //no. of drinks
        totalPrice = (TextView)findViewById(R.id.textView1); //total price to pay
        seatsPreview = (TextView)findViewById(R.id.textView10);

        next = (Button)findViewById(R.id.btnProceed); //proceed to next activity
        btn1 = (Button)findViewById(R.id.btnAddPop); //button to add popcorn
        btn2 = (Button)findViewById(R.id.btnAddDrink); //button to add drinks
        btn3 = (Button)findViewById(R.id.btnProceed); //proceed button


        final String movieName = getIntent().getStringExtra("movieName");
       final  float previousTotal = getIntent().getFloatExtra("price",0);
        final float totalseat =getIntent().getFloatExtra("totalseat",0);

        if(getIntent()!= null && getIntent().hasExtra("seatsTotalPrice"))
        {
            seatsPreview.setText(getIntent().getStringExtra("seatsTotalPrice"));
        }

        //click to add and long click to remove
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1++;
                total = total + 1;
                text1.setText(String.valueOf(counter1));
                price = (total * 10);
                totalPrice.setText(Float.toString(price + price2));
            }
        });
        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                counter1--;
                total = total - 1;
                text1.setText(String.valueOf(counter1));
                price = (total * 10);
                totalPrice.setText(Float.toString(price + price2));
                return true;
            }
        });
//click to add and long click to remove
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2++;
                total2 = total2 + 1;
                text2.setText(String.valueOf(counter2));
                price2 = (total2 * 5);
                totalPrice.setText(Float.toString(price2 + price));
            }
        });

        btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                counter2--;
                total2 = total2 - 1;
                text2.setText(String.valueOf(counter2));
                price2 = (total2 * 5);
                totalPrice.setText(Float.toString(price2 + price));
                return true;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddOnsPage.this,PaymentInfo.class);
                intent.putExtra("firstTotal", previousTotal);
                intent.putExtra("secondTotal", price2 + price);
                intent.putExtra("popValue", total);
                intent.putExtra("drinkValue", total2);
                intent.putExtra("movieName", movieName);
                intent.putExtra("totalseat",totalseat);
                startActivity(intent);
            }
        });

    }
}
