package com.example.thirdroc;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    ImageView payimg;
     List<String> list1= new ArrayList<>();
     RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        payimg=v.findViewById(R.id.pay);


        payimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(),ScannerActivity.class);
                startActivity(intent);
            }
        });

        recyclerView =v.findViewById(R.id.recycle);
        LinearLayoutManager lm=new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(lm);

        list1.add("name");
        list1.add("name");
        list1.add("name");
        list1.add("name");
        list1.add("name");
        list1.add("name");
        list1.add("name");
        list1.add("name");
        list1.add("name");
        list1.add("name");

        HomeRecycle homeRecycle = new HomeRecycle(getContext(),list1);
        recyclerView.setAdapter(homeRecycle);

        return v;
    }
}