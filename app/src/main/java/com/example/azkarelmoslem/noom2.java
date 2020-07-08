package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class noom2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noom2);

        ImageButton Next_noom2=findViewById(R.id.Next_noom2);
        Next_noom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noom3=new Intent(getApplicationContext(), noom3.class);
                startActivity(noom3);
                finish();

            }
        });
    }
}
