package com.example.thirdroc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thirdroc.extra.SelectClickListner;
import com.example.thirdroc.modals.SelectItem;

import java.util.ArrayList;
import java.util.List;

public class SelectStore extends AppCompatActivity implements SelectClickListner {


  RecyclerView recyclerView;
  TextView txt;
  View img;
  List<SelectItem> list=new ArrayList<>();
  RadioButton radioButton;
  Bundle bundle=new Bundle();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_store);
        txt=findViewById(R.id.txt);
        bundle=getIntent().getExtras();

//        Log.d("bundle", bundle.getString("first"));
        recyclerView =findViewById(R.id.recycle);
        img=findViewById(R.id.leftarrow);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SelectStore.this, AmmountPay.class);

                startActivity(intent);
            }
        });

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));
       list.add(new SelectItem("Relaynce Bank"));

         SelectRecycle selectRecycle=new SelectRecycle(this,list,this);

         recyclerView.setAdapter(selectRecycle);

    }

    @Override
    public void onItemClick(int position, String type) {
          Intent intent =new Intent(SelectStore.this, AmmountPay2.class);
        intent.putExtras(bundle);
          startActivity(intent);
    }
}