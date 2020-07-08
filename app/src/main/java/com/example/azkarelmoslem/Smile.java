package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Smile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile);
        Button Bt_1=findViewById(R.id.s1);
        Button Bt_2=findViewById(R.id.s2);
        Button Bt_3=findViewById(R.id.s3);
        Button Bt_4=findViewById(R.id.s4);
        Button Bt_5=findViewById(R.id.s5);
        Button Bt_6=findViewById(R.id.s6);
        Button Bt_7=findViewById(R.id.s7);
        Button Bt_8=findViewById(R.id.s8);
        Button Bt_9=findViewById(R.id.s9);
        Button Bt_10=findViewById(R.id.s10);
        Button Bt_11=findViewById(R.id.s11);
        Button Bt_12=findViewById(R.id.s12);
        Button Bt_13=findViewById(R.id.s13);
        Button Bt_14=findViewById(R.id.s14);
        Button Bt_15=findViewById(R.id.s15);
        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah5_1=new Intent(getBaseContext(),kadal1_5.class);
                startActivity(sabah5_1);
            }
        });
        Bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom51=new Intent(getBaseContext(),mosyba2_5.class);
                startActivity(noom51);
            }
        });
        Bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep51=new Intent(getBaseContext(),wes3_5.class);
                startActivity(sleep51);
            }
        });
        Bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah5=new Intent(getBaseContext(),sherk4_5.class);
                startActivity(fazah5);
            }
        });
        Bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),tyar5_5.class);
                startActivity(takalap5);
            }
        });
        Bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),endfazah6_5.class);
                startActivity(takalap5);
            }
        });
        Bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),yosr7_5.class);
                startActivity(takalap5);
            }
        });
        Bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),sar8_5.class);
                startActivity(takalap5);
            }
        });
        Bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah5_1=new Intent(getBaseContext(),kar9_5.class);
                startActivity(sabah5_1);
            }
        });
        Bt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom51=new Intent(getBaseContext(),kaf10_5.class);
                startActivity(noom51);
            }
        });
        Bt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep51=new Intent(getBaseContext(),adw11_5.class);
                startActivity(sleep51);
            }
        });
        Bt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah5=new Intent(getBaseContext(),zolm12_5.class);
                startActivity(fazah5);
            }
        });
        Bt_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),soltan13_5.class);
                startActivity(takalap5);
            }
        });
        Bt_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),karb14_5.class);
                startActivity(takalap5);
            }
        });
        Bt_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),ham15_5.class);
                startActivity(takalap5);
            }
        });
    }
}
