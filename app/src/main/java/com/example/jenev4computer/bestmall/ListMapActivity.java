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

    }

}
