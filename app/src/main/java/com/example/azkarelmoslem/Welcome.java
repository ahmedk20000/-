package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Welcome extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);



        final ImageView Img_Welcome = findViewById(R.id.Image_Welcome);
      Thread thread=new Thread(){
          @Override
          public void run() {
              try {
                  sleep(4000);
                  Intent MainActivity5=new Intent(getApplicationContext(),MainActivity.class);
                  startActivity(MainActivity5);
                  finish();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      };
      thread.start();




    }



}


