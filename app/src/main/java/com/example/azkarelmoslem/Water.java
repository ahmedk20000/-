package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Water extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        Button Bt_1=findViewById(R.id.Water1);
        Button Bt_2=findViewById(R.id.Water2);
        Button Bt_3=findViewById(R.id.Water3);
        Button Bt_4=findViewById(R.id.Water4);
        Button Bt_5=findViewById(R.id.Water5);
        Button Bt_6=findViewById(R.id.Water6);
        Button Bt_7=findViewById(R.id.Water7);
        Button Bt_8=findViewById(R.id.Water8);
        Button Bt_9=findViewById(R.id.Water9);
        Button Bt_10=findViewById(R.id.Water10);
        Button Bt_11=findViewById(R.id.Water11);
        Button Bt_12=findViewById(R.id.Water12);
        Button Bt_13=findViewById(R.id.Water13);
        Button Bt_14=findViewById(R.id.Water14);
        Button Bt_15=findViewById(R.id.Water15);
        Button Bt_16=findViewById(R.id.Water16);
        Button Bt_17=findViewById(R.id.Water17);
        Button Bt_18=findViewById(R.id.Water18);
        Button Bt_19=findViewById(R.id.Water19);
        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah_1=new Intent(getBaseContext(),beforesala.class);
                startActivity(sabah_1);
            }
        });
        Bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom1=new Intent(getBaseContext(),aftersala1.class);
                startActivity(noom1);
                finish();
            }
        });
        Bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep1=new Intent(getBaseContext(),gomasged.class);
                startActivity(sleep1);
            }
        });
        Bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah=new Intent(getBaseContext(),dokolmasged.class);
                startActivity(fazah);
            }
        });
        Bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),korogmasged.class);
                startActivity(takalap);
            }
        });
        Bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),azan.class);
                startActivity(takalap);
            }
        });
        Bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),start.class);
                startActivity(takalap);
            }
        });
        Bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),rokoa.class);
                startActivity(takalap);
            }
        });
        Bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),rafarokoa.class);
                startActivity(takalap);
            }
        });
        Bt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),sogod.class);
                startActivity(takalap);
            }
        });
        Bt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),sogod.class);
                startActivity(takalap);
            }
        });
        Bt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),sogod.class);
                startActivity(takalap);
            }
        });
        Bt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),sogod.class);
                startActivity(takalap);
            }
        });
        Bt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),galsa.class);
                startActivity(takalap);
            }
        });
        Bt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),sagdatelawa.class);
                startActivity(takalap);
            }
        });
        Bt_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),tashahod.class);
                startActivity(takalap);
            }
        });
        Bt_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),BA.class);
                startActivity(takalap);
            }
        });
        Bt_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),naby.class);
                startActivity(takalap);
            }
        });
        Bt_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),AfterSalam.class);
                startActivity(takalap);
            }
        });
        Bt_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),Konot.class);
                startActivity(takalap);
            }
        });
        Bt_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),AfterWetr.class);
                startActivity(takalap);
            }
        });
        Bt_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),Waswasa.class);
                startActivity(takalap);
            }
        });
    }
}
