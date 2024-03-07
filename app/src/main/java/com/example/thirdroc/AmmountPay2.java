package com.example.thirdroc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.thirdroc.databinding.ActivityAmmountPay2Binding;
import com.example.thirdroc.databinding.BottonmSheetAmmountBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class AmmountPay2 extends AppCompatActivity {
    ActivityAmmountPay2Binding activityAmmountPay2Binding;
    Bundle bundle=new Bundle();
   TextView textView;

  // BottonmSheetAmmountBinding bottonmSheetAmmountBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     activityAmmountPay2Binding = ActivityAmmountPay2Binding.inflate(getLayoutInflater());
     setContentView(activityAmmountPay2Binding.getRoot());
          bundle=getIntent().getExtras();
     activityAmmountPay2Binding.money2.setText(bundle.getString("first","0"));
      activityAmmountPay2Binding.leftarrow.setOnClickListener(v -> {
         Intent intent =new Intent(AmmountPay2.this,SelectStore.class);
         startActivity(intent);
     });

     BottomSheetDialog bottomSheetDialog =new BottomSheetDialog(this);
     BottonmSheetAmmountBinding bottonmSheetAmmountBinding= BottonmSheetAmmountBinding.inflate(getLayoutInflater());
     bottomSheetDialog.setContentView(bottonmSheetAmmountBinding.getRoot());
     bottomSheetDialog.setCancelable(true);
     bottomSheetDialog.show();

     bottonmSheetAmmountBinding.round.setOnClickListener(v -> {
           bottonmSheetAmmountBinding.round1.setChecked(false);
           bottonmSheetAmmountBinding.r.setChecked(false);
           bottonmSheetAmmountBinding.radio.setChecked(false);
     });
        bottonmSheetAmmountBinding.round1.setOnClickListener(v -> {
            bottonmSheetAmmountBinding.round.setChecked(false);
            bottonmSheetAmmountBinding.r.setChecked(false);
            bottonmSheetAmmountBinding.radio.setChecked(false);
        });
        bottonmSheetAmmountBinding.r.setOnClickListener(v -> {
            bottonmSheetAmmountBinding.round1.setChecked(false);
            bottonmSheetAmmountBinding.round.setChecked(false);
            bottonmSheetAmmountBinding.radio.setChecked(false);
        });
        bottonmSheetAmmountBinding.radio.setOnClickListener(v -> {
            bottonmSheetAmmountBinding.round1.setChecked(false);
            bottonmSheetAmmountBinding.r.setChecked(false);
            bottonmSheetAmmountBinding.round.setChecked(false);
        });

     bottonmSheetAmmountBinding.button.setOnClickListener(v -> {
          Intent intent=new Intent(AmmountPay2.this,TransferReceipt.class);
         intent.putExtras(bundle);
          startActivity(intent);
     });
    }
}