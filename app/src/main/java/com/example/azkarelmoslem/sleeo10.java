package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sleeo10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeo10);
        ImageButton Next_sleep4=findViewById(R.id.Next_sleep10);
        Next_sleep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep5=new Intent(getApplicationContext(),sleep11.class);
                startActivity(sleep5);
                finish();
            }
        });
    }
}
