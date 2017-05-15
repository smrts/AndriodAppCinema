package com.example.kilo.cinemaprojectfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.list;

public class SeatSelection extends AppCompatActivity {

    Spinner spinner, spinner2, spinner3;
    ArrayAdapter<CharSequence> adapter, adapter2, adapter3;
    private int c1a = 0, c1b = 0, c1c = 0, c1d = 0, c2a = 0, c2b = 0, c2c = 0, c2d = 0, c2e = 0, c2f = 0, c3a = 0, c3b = 0,
            c3c = 0, c3d = 0, c3e = 0, c3f = 0, c4a = 0, c4b = 0, c4c = 0, c4d = 0, c4e = 0, c4f = 0;
    float total = 0;
    float price;
    Button button1a, button1b, button1c, button1d, button2a, button2b, button2c, button2d, button2e,
            button2f, button3a, button3b, button3c, button3d, button3e, button3f, button4a, button4b,
            button4c, button4d, button4e, button4f, next;

    TextView priced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);

        final String movieName = getIntent().getStringExtra("movieName");
        setTitle("Watch " + movieName);

        spinner = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner3 = (Spinner)findViewById(R.id.spinner3);


        adapter = ArrayAdapter.createFromResource(this, R.array.cinema_names,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter2 = ArrayAdapter.createFromResource(this, R.array.dates,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter3 = ArrayAdapter.createFromResource(this, R.array.time,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button1a = (Button) findViewById(R.id.button1A);
        button1b = (Button) findViewById(R.id.button1B);
        button1c = (Button) findViewById(R.id.button1C);
        button1d = (Button) findViewById(R.id.button1D);
        button2a = (Button) findViewById(R.id.button2A);
        button2b = (Button) findViewById(R.id.button2B);
        button2c = (Button) findViewById(R.id.button2C);
        button2d = (Button) findViewById(R.id.button2D);
        button2e = (Button) findViewById(R.id.button2E);
        button2f = (Button) findViewById(R.id.button2F);
        button3a = (Button) findViewById(R.id.button3A);
        button3b = (Button) findViewById(R.id.button3B);
        button3c = (Button) findViewById(R.id.button3C);
        button3d = (Button) findViewById(R.id.button3D);
        button3e = (Button) findViewById(R.id.button3E);
        button3f = (Button) findViewById(R.id.button3F);
        button4a = (Button) findViewById(R.id.button4A);
        button4b = (Button) findViewById(R.id.button4B);
        button4c = (Button) findViewById(R.id.button4C);
        button4d = (Button) findViewById(R.id.button4D);
        button4e = (Button) findViewById(R.id.button4E);
        button4f = (Button) findViewById(R.id.button4F);


        priced = (TextView) findViewById(R.id.textView1);

        button1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1a++;
                total = total + 1;
                button1a.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button1a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c1a--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c1a == 0) {
                    button1a.setBackgroundResource(R.drawable.colorbutton);
                }

                return true;
            }
        });

        button1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1b++;
                total = total + 1;
                button1b.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));
            }
        });

        button1b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c1b--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c1b == 0) {
                    button1b.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1c++;
                total = total + 1;
                button1c.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button1c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c1c--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c1c == 0) {
                    button1c.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button1d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1d++;
                total = total + 1;
                button1d.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button1d.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c1d--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c1d == 0) {
                    button1d.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2a++;
                total = total + 1;
                button2a.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button2a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c2a--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c2a == 0) {
                    button2a.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2b++;
                total = total + 1;
                button2b.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button2b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c2b--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c2b == 0) {
                    button2b.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2c++;
                total = total + 1;
                button2c.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button2c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c2c--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c2c == 0) {
                    button2c.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button2d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2d++;
                total = total + 1;
                button2d.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button2d.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c2d--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c2d == 0) {
                    button2d.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button2e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2e++;
                total = total + 1;
                button2e.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button2e.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c2e--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c2e == 0) {
                    button2e.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button2f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2f++;
                total = total + 1;
                button2f.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button2f.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c2f--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c2f == 0) {
                    button2f.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3a++;
                total = total + 1;
                button3a.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button3a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c3a--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c3a == 0) {
                    button3a.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3b++;
                total = total + 1;
                button3b.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button3b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c3b--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c3b == 0) {
                    button3b.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3c++;
                total = total + 1;
                button3c.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button3c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c3c--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c3c == 0) {
                    button3c.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3d++;
                total = total + 1;
                button3d.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button3d.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c3d--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c3d == 0) {
                    button3d.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button3e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3e++;
                total = total + 1;
                button3e.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button3e.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c3e--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c3e == 0) {
                    button3e.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button3f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3f++;
                total = total + 1;
                button3f.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button3f.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c3f--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c3f == 0) {
                    button3f.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4a++;
                total = total + 1;
                button4a.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button4a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c4a--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c4a == 0) {
                    button4a.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4b++;
                total = total + 1;
                button4b.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button4b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c4b--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c4b == 0) {
                    button4b.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4c++;
                total = total + 1;
                button4c.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button4c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c4c--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c4c == 0) {
                    button4c.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button4d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4d++;
                total = total + 1;
                button4d.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button4d.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c4d--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c4d == 0) {
                    button4d.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button4e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4e++;
                total = total + 1;
                button4e.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button4e.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c4e--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c4e == 0) {
                    button4e.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });

        button4f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4f++;
                total = total + 1;
                button4f.setBackgroundResource(R.drawable.buttonselected);
                price = total * 10;
                priced.setText(Float.toString(price));

            }
        });

        button4f.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                c4f--;
                total = total - 1;
                price = total * 10;
                priced.setText(Float.toString(price));
                if (c4f == 0) {
                    button4f.setBackgroundResource(R.drawable.colorbutton);
                }
                return true;
            }
        });
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeatSelection.this, AddOnsPage.class);
                intent.putExtra("price", price);
                intent.putExtra("movieName", movieName);
                intent.putExtra("totalseat", total);
                startActivity(intent);
            }
        });

    }
}