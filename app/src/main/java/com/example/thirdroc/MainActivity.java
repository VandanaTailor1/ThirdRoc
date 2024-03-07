package com.example.thirdroc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.thirdroc.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //ImageView iconimg;
       ActivityMainBinding activityMainBinding;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
//        iconimg =findViewById(R.id.icon);
       activityMainBinding.icon.setOnClickListener(v -> {
           Intent intent =new Intent(MainActivity.this,SignPage.class);
           startActivity(intent);
       });
    }
}