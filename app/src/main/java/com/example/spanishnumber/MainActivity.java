package com.example.spanishnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        b10 = findViewById(R.id.ten);

        m1 = MediaPlayer.create(this,R.raw.one);
        m2 = MediaPlayer.create(this,R.raw.two);
        m3 = MediaPlayer.create(this,R.raw.three);
        m4 = MediaPlayer.create(this,R.raw.four);
        m5 = MediaPlayer.create(this,R.raw.five);
        m6 = MediaPlayer.create(this,R.raw.six);
        m7 = MediaPlayer.create(this,R.raw.seven);
        m8 = MediaPlayer.create(this,R.raw.eight);
        m9 = MediaPlayer.create(this,R.raw.nine);
        m10 = MediaPlayer.create(this,R.raw.ten);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m6.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m7.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m8.start();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m9.start();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m10.start();
            }
        });

    }
}
