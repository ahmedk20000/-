package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sabah_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah_3);
        ImageButton Next4=findViewById(R.id.Next3);
        Next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sabah4=new Intent(getApplicationContext(),sabah_4.class);
                startActivity(Sabah4);
                finish();
            }
        });
    }
}
