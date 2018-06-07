package com.team10.bestmalls;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


public class DetailViewActivity extends AppCompatActivity {

    private ImageButton btn_back;
    private ImageButton btn_navigateto;
    private ImageView img_mall;
    private RatingBar ratingbar_total;
    private RatingBar ratingbar1;
    private RatingBar ratingbar2;
    private RatingBar ratingbar3;
    private TextView  title;
    private TextView  description;
    private String navToAdress;

    private Mall mall;
    private double longitude;
    private double latitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);


        title = (TextView) findViewById (R.id.tv_adv_headline);
        description = (TextView) findViewById(R.id.tv_adv_description);

        btn_back = (ImageButton) findViewById(R.id. btn_adv_back);
          btn_back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(DetailViewActivity.this, ListMapActivity.class );
                 startActivity(intent);

                }
        });

        btn_navigateto = (ImageButton) findViewById(R.id.btn_adv_maps);
          btn_navigateto.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(navToAdress));
                startActivity(intent);

               }
        });


        img_mall = (ImageView) findViewById(R.id.image_adv_mallpic);
        ratingbar_total = (RatingBar) findViewById(R.id.adv_ratingBar_total);
        ratingbar1 = (RatingBar) findViewById(R.id.adv_ratingBar_rate1);
        ratingbar2 = (RatingBar) findViewById(R.id.adv_ratingBar_rate2);
        ratingbar3 = (RatingBar) findViewById(R.id.adv_ratingBar_rate3);

        title.setText(getIntent().getStringExtra("title"));
        description.setText(getIntent().getStringExtra("description"));
        latitude = getIntent().getDoubleExtra("latitude",0);
        longitude = getIntent().getDoubleExtra("longitude",0);

        navToAdress = "google.navigation:q="+latitude+","+longitude+"";

    }
}
