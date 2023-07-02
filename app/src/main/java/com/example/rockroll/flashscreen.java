package com.example.rockroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class flashscreen extends AppCompatActivity {
TextView appname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashscreen);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent nextScreen=new Intent(flashscreen.this,MainActivity.class);
                startActivity(nextScreen);
                finish();
            }
        },4000);
        appname=findViewById(R.id.appname);
        appname.animate().scaleYBy(0.3f).scaleXBy(0.3f).setDuration(1000);
    }
}
