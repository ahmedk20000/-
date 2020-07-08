package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sabah18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah18);
        ImageButton Next18=findViewById(R.id.Next18);
        Next18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah19=new Intent(getApplicationContext(),sabah19.class);
                startActivity(sabah19);
                finish();
            }
        });
    }
}
