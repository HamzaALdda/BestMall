package com.example.jenev4computer.bestmall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //This is a Test
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn_login = (Button) findViewById(R.id.loginView_btn_Login);
         btn_login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 Intent intent = new Intent(MainActivity.this, ListMapActivity.class);
                 startActivity(intent);
             }
         });
    }
}
