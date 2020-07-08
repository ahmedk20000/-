package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class aftersala1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftersala1);

        ImageButton Next1=findViewById(R.id.Next_sala1);
        Next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sala2=new Intent(getApplicationContext(),aftersala2.class);
                startActivity(sala2);
                finish();
            }
        });
    }
}
