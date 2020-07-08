package com.example.azkarelmoslem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);




        ImageView Img_Morning=findViewById(R.id.Image_Morning);
        Button Btn_Morning=findViewById(R.id.Bt_Morning);
        ImageView Img_Water=findViewById(R.id.Image_Water);
        Button Btn_Water=findViewById(R.id.Bt_Water);
        ImageView Img_Food=findViewById(R.id.Image_Food);
        Button Btn_Food=findViewById(R.id.Bt_Food);
        ImageView Img_hogg=findViewById(R.id.Image_hogg);
        Button Btn_hogg=findViewById(R.id.Bt_hogg);
        ImageView Img_Smile=findViewById(R.id.Image_Smile);
        Button Btn_Smile=findViewById(R.id.Bt_Smile);
        ImageView Img_Patient=findViewById(R.id.Image_patient);
        Button Btn_Patient=findViewById(R.id.Bt_patient);
        ImageView Img_Deal=findViewById(R.id.Image_Deal);
        Button Btn_Deal=findViewById(R.id.Bt_Deal);
        ImageView Img_Travel=findViewById(R.id.Image_Travel);
        Button Btn_Travel=findViewById(R.id.Bt_Travel);
        ImageView Img_Hasad=findViewById(R.id.Image_Hasad);
        Button Btn_Hasad=findViewById(R.id.Bt_Hasad);
        ImageView Img_Study=findViewById(R.id.Image_Study);
        Button Btn_Study=findViewById(R.id.Bt_Study);
        Btn_Morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Morning=new Intent(getBaseContext(), Morning.class);
                startActivity(Morning);
            }
        });

        Img_Morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Morning=new Intent(getBaseContext(), Morning.class);
                startActivity(Morning);
            }
        });
        Img_Water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Water=new Intent(getBaseContext(),Water.class);
                startActivity(Water);
            }
        });
        Btn_Water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Water=new Intent( getBaseContext(),Water.class);
                startActivity(Water);
            }
        });

        Img_Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Food=new Intent(getBaseContext(), Food.class);
                startActivity(Food);
            }
        });
Btn_Food.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent Food=new Intent(getBaseContext(),Food.class);
        startActivity(Food);
    }
});
        Img_hogg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hag=new Intent(getApplicationContext(), hogg.class);
                startActivity(Hag);
            }
        });
        Btn_hogg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hag=new Intent(getApplicationContext(),hogg.class);
                startActivity(Hag);
            }
        });
        Img_Smile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Smile=new Intent(getBaseContext(), Smile.class);
                startActivity(Smile);
            }
        });
        Btn_Smile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Smile=new Intent(getBaseContext(),Smile.class);
                startActivity(Smile);
            }
        });
        Img_Patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Patient=new Intent(getBaseContext(), Patient.class);
                startActivity(Patient);
            }
        });
        Btn_Patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Patient=new Intent(getBaseContext(),Patient.class);
                startActivity(Patient);
            }
        });
        Img_Deal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Deal=new Intent(getBaseContext(), Deal.class);
                startActivity(Deal);
            }
        });
        Btn_Deal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Deal=new Intent(getBaseContext(),Deal.class);
                startActivity(Deal);
            }
        });
        Img_Travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent travell=new Intent(getBaseContext(), travell.class);
                startActivity(travell);
            }
        });
        Btn_Travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent travell=new Intent(getBaseContext(),travell.class);
                startActivity(travell);
            }
        });
        Img_Hasad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hasad=new Intent(getBaseContext(), Hasad.class);
                startActivity(Hasad);
            }
        });
        Btn_Hasad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hasad=new Intent(getBaseContext(),Hasad.class);
                startActivity(Hasad);
            }
        });
        Img_Study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hasad=new Intent(getBaseContext(), study.class);
                startActivity(Hasad);
            }
        });
        Btn_Study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hasad=new Intent(getBaseContext(),study.class);
                startActivity(Hasad);
            }
        });

    }
// to design tool bar write?
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.Menu_home)
        {
            Intent important=new Intent(getApplicationContext(),important.class);
            startActivity(important);
        }
        if(id==R.id.Menu_AboutUs)
        {
Intent AboutUs=new Intent(getApplicationContext(), AboutUs.class);
startActivity(AboutUs);
        }
        if (id==R.id.Menu_ContactUs)
        {
            Intent ContactUs=new Intent(getApplicationContext(), ContactNew.class);
            startActivity(ContactUs);
        }

        return super.onOptionsItemSelected(item);
    }
    // لحد هنا يبقي انتهيت من برمجة ال class
}
