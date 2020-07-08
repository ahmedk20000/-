package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Morning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);

        Button Bt_1=findViewById(R.id.M1);
        Button Bt_3=findViewById(R.id.M3);
        Button Bt_4=findViewById(R.id.M4);
        Button Bt_5=findViewById(R.id.M5);
        Button Bt_6=findViewById(R.id.M6);
        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah_1=new Intent(getBaseContext(),Sabah_1.class);
                startActivity(sabah_1);
                finish();
            }
        });
        Bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom1=new Intent(getBaseContext(),noom1.class);
                startActivity(noom1);
                finish();
            }
        });
        Bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep1=new Intent(getBaseContext(),Sleep1.class);
                startActivity(sleep1);
                finish();
            }
        });
        Bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah=new Intent(getBaseContext(),fazah.class);
                startActivity(fazah);
            }
        });
        Bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),takalap.class);
                startActivity(takalap);
            }
        });
    }
}
