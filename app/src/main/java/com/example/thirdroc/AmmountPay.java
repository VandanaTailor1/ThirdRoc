package com.example.thirdroc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.thirdroc.databinding.ActivityAmmountPayBinding;
public class AmmountPay extends AppCompatActivity {
    View view;
    RadioGroup rg1, rg2;
    EditText editText;
    RadioButton r1, r2;
    Button button, btn;
    Bundle bundle;
    ActivityAmmountPayBinding activityAmmountPayBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityAmmountPayBinding = ActivityAmmountPayBinding.inflate(getLayoutInflater());
        setContentView(activityAmmountPayBinding.getRoot());
        r1 = findViewById(R.id.round);
        r2 = findViewById(R.id.round1);
        view=findViewById(R.id.leftarrow);
        editText = findViewById(R.id.money);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            Log.d("r1",String.valueOf(r1.isChecked()));
            Log.d("r2",String.valueOf(r2.isChecked()));
            if (editText.getText().toString().isEmpty()) {
                Toast.makeText(this, "Fill the Money", Toast.LENGTH_SHORT).show();
            } else if (editText.getText().toString().startsWith("0")) {
                Toast.makeText(this, "please enter valid amount", Toast.LENGTH_SHORT).show();
            } else if(!r1.isChecked() || r2.isChecked()){
                 Toast.makeText(this,"please Select Payment Method",Toast.LENGTH_SHORT).show();
            }
            else {
                Intent intent = new Intent(AmmountPay.this, SelectStore.class);
                bundle=new Bundle();
                bundle.putString("first",editText.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r2.setChecked(false);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1.setChecked(false);
            }
        });
       view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}