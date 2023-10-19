package com.example.thirdroc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignPage extends AppCompatActivity {
        AppCompatButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_page);
        button =findViewById(R.id.gntotp);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(SignPage.this,OtpActivity.class);
                startActivity(intent1);
            }
        });
    }
}