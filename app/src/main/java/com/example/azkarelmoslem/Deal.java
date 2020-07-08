package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Deal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal);

        Button Bt_1=findViewById(R.id.Deal1);
        Button Bt_2=findViewById(R.id.Deal2);
        Button Bt_3=findViewById(R.id.Deal3);
        Button Bt_4=findViewById(R.id.Deal4);
        Button Bt_5=findViewById(R.id.Deal5);
        Button Bt_6=findViewById(R.id.Deal6);
        Button Bt_7=findViewById(R.id.Deal7);
        Button Bt_8=findViewById(R.id.Deal8);
        Button Bt_9=findViewById(R.id.Deal9);
        Button Bt_10=findViewById(R.id.Deal10);
        Button Bt_11=findViewById(R.id.Deal11);
        Button Bt_12=findViewById(R.id.Deal12);
        Button Bt_13=findViewById(R.id.Deal13);
        Button Bt_14=findViewById(R.id.Deal14);
        Button Bt_15=findViewById(R.id.Deal15);
        Button Bt_16=findViewById(R.id.Deal16);
        Button Bt_17=findViewById(R.id.Deal17);
        Button Bt_18=findViewById(R.id.Deal18);
        Button Bt_19=findViewById(R.id.Deal19);
        Button Bt_20=findViewById(R.id.Deal20);
        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah_1=new Intent(getBaseContext(),eza1_7.class);
                startActivity(sabah_1);
            }
        });
        Bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom1=new Intent(getBaseContext(),madh2_7.class);
                startActivity(noom1);
            }
        });
        Bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep1=new Intent(getBaseContext(),sab3_7.class);
                startActivity(sleep1);
            }
        });
        Bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah=new Intent(getBaseContext(),salam4_7.class);
                startActivity(fazah);
            }
        });
        Bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),kafer5_7.class);
                startActivity(takalap);
            }
        });
        Bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),barak6_7.class);
                startActivity(takalap);
            }
        });
        Bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),kada7_7.class);
                startActivity(takalap);
            }
        });
        Bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah_1=new Intent(getBaseContext(),malah8_7.class);
                startActivity(sabah_1);
            }
        });
        Bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah_1=new Intent(getBaseContext(),habak9_7.class);
                startActivity(sabah_1);
            }
        });
        Bt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep1=new Intent(getBaseContext(),mawlod10_7.class);
                startActivity(sleep1);
            }
        });
        Bt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah=new Intent(getBaseContext(),sam11_7.class);
                startActivity(fazah);
            }
        });
        Bt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),ats12_7.class);
                startActivity(takalap);
            }
        });
        Bt_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),kafer13_7.class);
                startActivity(takalap);
            }
        });
        Bt_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),motzaweg14_7.class);
                startActivity(takalap);
            }
        });
        Bt_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom1=new Intent(getBaseContext(),kadab15_7.class);
                startActivity(noom1);
            }
        });
        Bt_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep1=new Intent(getBaseContext(),mobtala16_7.class);
                startActivity(sleep1);
            }
        });
        Bt_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fazah=new Intent(getBaseContext(),magles17_7.class);
                startActivity(fazah);
            }
        });
        Bt_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),kfara18_7.class);
                startActivity(takalap);
            }
        });
        Bt_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),gafara19_7.class);
                startActivity(takalap);
            }
        });
        Bt_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takalap=new Intent(getBaseContext(),sana20_7.class);
                startActivity(takalap);
            }
        });
    }

}
