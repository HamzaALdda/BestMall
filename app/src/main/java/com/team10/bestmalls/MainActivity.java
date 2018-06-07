package com.team10.bestmalls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //This is a Test
    private String testmail = "test@test.com";
    private String testPassword = "test";

    private Button btn_login;
    private TextView tv_email;
    private TextView tv_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_email = (TextView) findViewById(R.id.loginView_textField_email);
        tv_password = (TextView) findViewById(R.id.loginView_textField_password);

        btn_login = (Button) findViewById(R.id.loginView_btn_Login);
         btn_login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if((tv_email.getText().toString().equals(testmail)) && (tv_password.getText().toString().equals(testPassword)) ){


                     //Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Modemannstr.2 51065"));
                     //startActivity(intent);
                     Intent intent = new Intent(MainActivity.this, ListMapActivity.class);
                     startActivity(intent);

                 }else{

                     Toast toast = Toast.makeText(getApplicationContext(), "Your Email or Password is not Correct", Toast.LENGTH_LONG);
                     toast.show();

                 }


             }
         });

    }
}
