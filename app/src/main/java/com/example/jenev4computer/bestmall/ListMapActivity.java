package com.example.jenev4computer.bestmall;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ListMapActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private ImageButton btn_list;
    private ImageButton btn_map;
    private ImageButton btn_search;
    private TextView textView_input;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_map);

        textView_input = (EditText) findViewById(R.id.listView_textField_input);

        linearLayout = findViewById(R.id.listView_linearyLayout);

        btn_search  = (ImageButton) findViewById(R.id.listView_btn_search);
        btn_list    = (ImageButton) findViewById(R.id.listView_btn_list);
        btn_map     = (ImageButton) findViewById(R.id.listView_btn_map);

        // On ClickListener
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        // change this and loop for each entry in the DB for the Malls
        for (int i= 0; i<10;i++){

            //First Line Title and ratingbar
            LinearLayout firstLine = new LinearLayout(this);
            firstLine.setOrientation(LinearLayout.HORIZONTAL);

            TextView title = new TextView(this);
            title.setText("Forum Gummersbach");
            title.setTextSize(20);

            RatingBar ratingBar = new RatingBar(this);
            ratingBar.setEnabled(false);

            firstLine.addView(title);
            firstLine.addView(ratingBar);

            //Seconde Line Img - City(Text) - img - dist(Text)

            LinearLayout secondeLine = new LinearLayout(this);
            secondeLine.setOrientation(LinearLayout.HORIZONTAL);

            Image img_cityLoc;
            Image img_dist;
            TextView city = new TextView(this);
            TextView dist = new TextView(this);

            city.setText("Gummersbach");
            dist.setText("22km");

            secondeLine.addView(city);
            secondeLine.addView(dist);

            LinearLayout panel = new LinearLayout(this);
            panel.setOrientation(LinearLayout.VERTICAL);
            panel.addView(firstLine);
            panel.addView(secondeLine);
            panel.setBackgroundColor(Color.rgb(128,128,128));

            panel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ListMapActivity.this, DetailViewActivity.class);
                    startActivity(intent);
                }
            });

            linearLayout.addView(panel);
        }
    }
}
