package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class hogg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hogg);

        Button Bt_1=findViewById(R.id.Hag1);
        Button Bt_2=findViewById(R.id.Hag2);
        Button Bt_3=findViewById(R.id.Hag3);
        Button Bt_4=findViewById(R.id.Hag4);
        Button Bt_5=findViewById(R.id.Hag5);
        Button Bt_6=findViewById(R.id.Hag6);
        Button Bt_7=findViewById(R.id.Hag7);
        Button Bt_8=findViewById(R.id.Hag8);
        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah5_1=new Intent(getBaseContext(),kayf1_4.class);
                startActivity(sabah5_1);
            }
        });
        Bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom51=new Intent(getBaseContext(),takbeer2_4.class);
                startActivity(noom51);
            }
        });
        Bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep51=new Intent(getBaseContext(),rokn3_4.class);
                startActivity(sleep51);
            }
        });
        Bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah5=new Intent(getBaseContext(),wakoof4_4.class);
                startActivity(fazah5);
            }
        });
        Bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),arafa5_4.class);
                startActivity(takalap5);
            }
        });
        Bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),mashar6_4.class);
                startActivity(takalap5);
            }
        });
        Bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),ramy7_4.class);
                startActivity(takalap5);
            }
        });
        Bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),zabh8_4.class);
                startActivity(takalap5);
            }
        });
    }
}


