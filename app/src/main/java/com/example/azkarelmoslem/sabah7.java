package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class sabah7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah7);

        ImageButton Next7=findViewById(R.id.Back7);
        Next7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabah8=new Intent(getApplicationContext(),sabah8.class);
                startActivity(sabah8);
                finish();
            }
        });

    }
}
