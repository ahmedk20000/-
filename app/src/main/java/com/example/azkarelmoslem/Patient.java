package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Patient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        Button Bt_1=findViewById(R.id.Blt1);
        Button Bt_2=findViewById(R.id.Blt2);
        Button Bt_3=findViewById(R.id.Blt3);
        Button Bt_4=findViewById(R.id.Blt4);
        Button Bt_5=findViewById(R.id.Blt5);
        Button Bt_6=findViewById(R.id.Blt6);
        Button Bt_7=findViewById(R.id.Blt7);
        Button Bt_8=findViewById(R.id.Blt8);
        Button Bt_9=findViewById(R.id.Blt9);
        Button Bt_10=findViewById(R.id.Blt10);
        Button Bt_11=findViewById(R.id.Blt11);
        Button Bt_12=findViewById(R.id.Blt12);
        Button Bt_13=findViewById(R.id.Blt13);

        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah5_1=new Intent(getBaseContext(),alam1_6.class);
                startActivity(sabah5_1);
            }
        });
        Bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom51=new Intent(getBaseContext(),zyara2_6.class);
                startActivity(noom51);
            }
        });
        Bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep51=new Intent(getBaseContext(),yaoz3_6.class);
                startActivity(sleep51);
            }
        });
        Bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah5=new Intent(getBaseContext(),maryd4_6.class);
                startActivity(fazah5);
            }
        });
        Bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),zmaryd5_6.class);
                startActivity(takalap5);
            }
        });
        Bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),yaes6_6.class);
                startActivity(takalap5);
            }
        });
        Bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),talken7_6.class);
                startActivity(takalap5);
            }
        });
        Bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),egmad8_6.class);
                startActivity(takalap5);
            }
        });
        Bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah5_1=new Intent(getBaseContext(),asna9_6.class);
                startActivity(sabah5_1);
            }
        });
        Bt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom51=new Intent(getBaseContext(),fart10_6.class);
                startActivity(noom51);
            }
        });
        Bt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep51=new Intent(getBaseContext(),tazya11_6.class);
                startActivity(sleep51);
            }
        });
        Bt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah5=new Intent(getBaseContext(),edkal12_6.class);
                startActivity(fazah5);
            }
        });
        Bt_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap5=new Intent(getBaseContext(),dafn13_6.class);
                startActivity(takalap5);
            }
        });
    }
}
