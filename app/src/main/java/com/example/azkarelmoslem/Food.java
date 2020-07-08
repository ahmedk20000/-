package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Button Bt_1=findViewById(R.id.Food1);
        Button Bt_2=findViewById(R.id.Food2);
        Button Bt_3=findViewById(R.id.Food3);
        Button Bt_4=findViewById(R.id.Food4);
        Button Bt_5=findViewById(R.id.Food5);
        Button Bt_6=findViewById(R.id.Food6);
        Button Bt_7=findViewById(R.id.Food7);
        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah_1=new Intent(getBaseContext(),end1_3.class);
                startActivity(sabah_1);
            }
        });
        Bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom1=new Intent(getBaseContext(),kabl2_3.class);
                startActivity(noom1);
            }
        });
        Bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep1=new Intent(getBaseContext(),bad3_3.class);
                startActivity(sleep1);
            }
        });
        Bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah=new Intent(getBaseContext(),lesaheb4_3.class);
                startActivity(fazah);
            }
        });
        Bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),tareed5_3.class);
                startActivity(takalap);
            }
        });
        Bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),endahl6_3.class);
                startActivity(takalap);
            }
        });
        Bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),lamyaftor7_3.class);
                startActivity(takalap);
            }
        });
    }
}
