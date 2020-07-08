package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sleep4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep4);
        ImageButton Next_sleep4=findViewById(R.id.Next_sleep4);
        Next_sleep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep5=new Intent(getApplicationContext(),sleep5.class);
                startActivity(sleep5);
                finish();
            }
        });
    }
}
