package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class noom3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noom3);

        ImageButton Next_noom3=findViewById(R.id.Next_noom3);
        Next_noom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom4=new Intent(getApplicationContext(), noom4.class);
                startActivity(noom4);
                finish();

            }
        });
    }
}
