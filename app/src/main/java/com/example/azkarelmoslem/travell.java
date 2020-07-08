package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class travell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travell);
        Button Bt_1=findViewById(R.id.travel1);
        Button Bt_2=findViewById(R.id.travel2);
        Button Bt_3=findViewById(R.id.travel3);
        Button Bt_4=findViewById(R.id.travel4);
        Button Bt_5=findViewById(R.id.travel5);
        Button Bt_6=findViewById(R.id.travel6);
        Button Bt_7=findViewById(R.id.travel7);
        Button Bt_8=findViewById(R.id.travel8);
        Button Bt_9=findViewById(R.id.travel9);
        Button Bt_10=findViewById(R.id.travel10);
        Button Bt_11=findViewById(R.id.travel11);
        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah_1=new Intent(getBaseContext(),rakb1_8.class);
                startActivity(sabah_1);
            }
        });
        Bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom1=new Intent(getBaseContext(),saf2_8_Text.class);
                startActivity(noom1);
            }
        });
        Bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep1=new Intent(getBaseContext(),bald3_8.class);
                startActivity(sleep1);
            }
        });
        Bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah=new Intent(getBaseContext(),souq4_8.class);
                startActivity(fazah);
            }
        });
        Bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),mark5_8.class);
                startActivity(takalap);
            }
        });
        Bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),mosafer6_8.class);
                startActivity(takalap);
            }
        });
        Bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),moq7_8.class);
                startActivity(takalap);
            }
        });
        Bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),takbeer2_4.class);
                startActivity(takalap);
            }
        });
        Bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah_1=new Intent(getBaseContext(),tak8_8.class);
                startActivity(sabah_1);
            }
        });
        Bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom1=new Intent(getBaseContext(),mos9_8.class);
                startActivity(noom1);
            }
        });
        Bt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep1=new Intent(getBaseContext(),nazl10_8.class);
                startActivity(sleep1);
            }
        });
        Bt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah=new Intent(getBaseContext(),raga11_8.class);
                startActivity(fazah);
            }
        });

    }
}
