package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class noom4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noom4);

        ImageButton Next_noom4=findViewById(R.id.Next_noom4);
        Next_noom4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity=new Intent(getApplicationContext(), Morning.class);
                startActivity(MainActivity);
                finish();

            }
        });
    }
}
