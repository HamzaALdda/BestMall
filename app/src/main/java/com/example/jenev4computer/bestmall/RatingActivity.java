package com.example.jenev4computer.bestmall;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingActivity extends AppCompatActivity {

    private ImageButton btn_back;
    private TextView tv_title;
    private TextInputEditText ti_opinion;
    private ImageButton btn_submit;
    private RatingBar ratingbar1;
    private RatingBar ratingbar2;
    private RatingBar ratingbar3;
    private RatingBar ratingbar4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        btn_back = findViewById(R.id.btn_ar_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //your code
                Intent intent = new Intent(RatingActivity.this,DetailViewActivity.class);
                startActivity(intent);
            }
        });
        btn_submit = findViewById(R.id.btn_ar_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //your code


                float r2 = ratingbar2.getRating();
                float r3 = ratingbar3.getRating();
                float r4 = ratingbar4.getRating();

                ratingbar1.setRating((r4+r2+r3) / 3);
            }
        });


        tv_title = findViewById(R.id.tv_ar_headline);
        ti_opinion = findViewById(R.id.ti_ar);
        ratingbar1 = (RatingBar) findViewById(R.id.ar_ratingBar_rate1);
        ratingbar1.setEnabled(false);
        ratingbar2 = (RatingBar) findViewById(R.id.ar_ratingBar_rate2);
        ratingbar3 = (RatingBar) findViewById(R.id.ar_ratingBar_rate3);
        ratingbar4 = (RatingBar) findViewById(R.id.ar_ratingBar_rate4);


    }
}
