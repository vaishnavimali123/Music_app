package com.example.rockroll;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer soundplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    public void playbutton(View view)
    {
        Button btn=(Button) view;
        int tagvalue=Integer.parseInt(btn.getTag().toString());
        playmusic(tagvalue);
    }

    public void playmusic(int tagvalue)
    {
        if(tagvalue==1)
        {
            soundplay =MediaPlayer.create(this,R.raw.clock);
            soundplay.start();
        }
        else if(tagvalue == 2)
        {
            soundplay =MediaPlayer.create(this,R.raw.dora);
            soundplay.start();
        }
        else if(tagvalue==3)
        {
            soundplay =MediaPlayer.create(this,R.raw.ganesh);
            soundplay.start();
        }
        else if(tagvalue==4)
        {
            soundplay =MediaPlayer.create(this,R.raw.ohno);
            soundplay.start();
        }
        else if(tagvalue==5)
        {
            soundplay =MediaPlayer.create(this,R.raw.messg);
            soundplay.start();
        }
        else if(tagvalue==6)
        {
            soundplay =MediaPlayer.create(this,R.raw.person);
            soundplay.start();
        }
        else if(tagvalue==7)
        {
            soundplay =MediaPlayer.create(this,R.raw.pikachu);
            soundplay.start();
        }
        else if(tagvalue==8)
        {
            soundplay =MediaPlayer.create(this,R.raw.ss);
            soundplay.start();
        }
        else if(tagvalue==9)
        {
            soundplay =MediaPlayer.create(this,R.raw.sintro);
            soundplay.start();
        }
        else if(tagvalue==10)
        {
            soundplay =MediaPlayer.create(this,R.raw.sintrom);
            soundplay.start();
        }
        else if(tagvalue==11)
        {
            soundplay =MediaPlayer.create(this,R.raw.ones);
            soundplay.start();
        }
        else if(tagvalue==12)
        {
            soundplay =MediaPlayer.create(this,R.raw.st);
            soundplay.start();
        }
    }
    public void onStop()
    {
        super.onStop();
        if (soundplay!=null)
        {
            soundplay.stop();
        }
    }
}
