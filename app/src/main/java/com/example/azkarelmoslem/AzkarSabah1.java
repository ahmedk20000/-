package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AzkarSabah1 extends AppCompatActivity {
TextView Text1;
Animation animi1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_sabah1);
Text1=(TextView) findViewById(R.id.textView);
//لتفعيل الانمي خاصية الظهور والاختفاء
animi1= AnimationUtils.loadAnimation(this,R.anim.animi1);
Text1.setAnimation(animi1);
// لتفعيل الانمي خاصية التكبير والتصغير في ملف ال انمي او مايسمي السكيل
        animi1= AnimationUtils.loadAnimation(this,R.anim.scale1);
        Text1.setAnimation(animi1);
        //عشان تعمل يبرنس تحريك يعني النص ييجي من أعلي لاسفل او يتحرك أفقي تستخدم translate
        // عشان تخليه يتحرك من فوق لتحت اعطيلوا قيمة ابتدائية سالبة
        animi1= AnimationUtils.loadAnimation(this,R.anim.tranlate1);
        Text1.setAnimation(animi1);
        // لتفعيل ملف الدوران يابرنس
        animi1= AnimationUtils.loadAnimation(this,R.anim.rotation1);
        Text1.setAnimation(animi1);

    }
}
