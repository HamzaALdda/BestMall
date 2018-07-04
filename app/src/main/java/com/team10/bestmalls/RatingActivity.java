package com.team10.bestmalls;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class RatingActivity extends AppCompatActivity {

    private ImageButton btn_back;
    private TextView tv_title;
    private TextInputEditText ti_opinion;
    private ImageButton btn_submit;
    private RatingBar ratingbar1;
    private RatingBar ratingbar2;
    private RatingBar ratingbar3;
    private RatingBar ratingbarTotal;


    private RecyclerView recyclerView;
    private CommentAdapter commentAdapter;
    private List<Comment> commentList;


    //-------------RecyclerView ------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        commentList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewComment);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        commentList.add(
                new Comment("suleymanzkl94@gmail.com","An sich eine schöne App","28.08.2018")
        );

        commentList.add(
                new Comment("amjad@yahoo.com","WOW! Immer ein Besuch Wert!", "22.08.2018")
        );

        commentAdapter = new CommentAdapter(this, commentList);
        recyclerView.setAdapter(commentAdapter);

        btn_back = findViewById(R.id.btn_ar_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //your code
                Intent intent = new Intent(RatingActivity.this,DetailViewActivity.class);
                startActivity(intent);
            }
        });
        btn_submit = findViewById(R.id.ratingView_btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //your code

                float r1 = ratingbar1.getRating();
                float r2 = ratingbar2.getRating();
                float r3 = ratingbar3.getRating();


                ratingbarTotal.setRating((r1+r2+r3) / 3);

            }
        });


        tv_title = findViewById(R.id.tv_ar_headline);
        ti_opinion = findViewById(R.id.ratingView_textField_comment);
        ratingbar1 = (RatingBar) findViewById(R.id.ar_ratingBar_rate1);
        ratingbar2 = (RatingBar) findViewById(R.id.ar_ratingBar_rate2);
        ratingbar3 = (RatingBar) findViewById(R.id.ar_ratingBar_rate3);
        ratingbarTotal = (RatingBar) findViewById(R.id.ar_ratingBar_total);
        ratingbarTotal.setEnabled(false);

        tv_title.setText(getIntent().getStringExtra("title"));

    }
}
