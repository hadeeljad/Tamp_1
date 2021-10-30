package com.hadeel.signinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btn = findViewById(R.id.signin);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,RegistrationForm.class);
                startActivity(i);
           }
       });


    }
}