package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ContactNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_new);
    }
    // بعد ما تسمي اسم للصورة مثلا في حالة اون كليك اعمل التالي .. لتفعيل الرابط
    public void Facebook_Url(View view) {
        Intent Facebook = new Intent(Intent.ACTION_VIEW);
        Facebook.setData(Uri.parse("https://www.facebook.com/BeTechnically"));
        if (Facebook.resolveActivity(getPackageManager()) != null) {
            startActivity(Facebook);
        }
    }

    public void Youtube_Url(View view) {
        Intent Youtube = new Intent(Intent.ACTION_VIEW);
        Youtube.setData(Uri.parse("https://www.youtube.com/channel/UCQnaZ0eAtpi6vTDRJ7mPKPA"));
        if (Youtube.resolveActivity(getPackageManager()) != null) {
            startActivity(Youtube);
        }
    }

    public void Twitter_Url(View view) {
        Intent Twitter = new Intent(Intent.ACTION_VIEW);
        Twitter.setData(Uri.parse("https://twitter.com/A7medK7alaf"));
        if (Twitter.resolveActivity(getPackageManager()) != null) {
            startActivity(Twitter);
        }
    }

    public void LinkIn_Url(View view) {
        Intent LinkIn = new Intent(Intent.ACTION_VIEW);
        LinkIn.setData(Uri.parse("https://www.linkedin.com/in/ahmed-khalafallah-4273491aa/"));
        if (LinkIn.resolveActivity(getPackageManager()) != null) {
            startActivity(LinkIn);
        }

    }

    // لعمل عملية اتصال مثلا نغير اسم الأكشن فقط بدل من فيو ل dial
    public void Tel_Url(View view) {
        Intent Tel = new Intent(Intent.ACTION_DIAL);
        Tel.setData(Uri.parse("tel:+201100283705"));
        if (Tel.resolveActivity(getPackageManager()) != null) {
            startActivity(Tel);
        }

    }
    public void Whatsapp_Url(View view) {
        Intent WhatsApp = new Intent(Intent.ACTION_VIEW);
        WhatsApp.setData(Uri.parse("https://chat.whatsapp.com/DSnXKDIa7lMI1v2lgApgzA"));
        if (WhatsApp.resolveActivity(getPackageManager()) != null) {
            startActivity(WhatsApp);
        }

    }
}
