package com.example.thirdroc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TransferReceipt extends AppCompatActivity {
  Button btn;
  Bundle bundle =new Bundle();
  TextView txt;
  ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_receipt);
        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.txt);
        bundle = getIntent().getExtras();
        img = findViewById(R.id.copy);
        txt.setText(bundle.getString("first", "0"));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        img.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", "Text to be copied");
            clipboard.setPrimaryClip(clip);
            Toast.makeText(this, "Copy the data", Toast.LENGTH_SHORT).show();
        });
    }
}