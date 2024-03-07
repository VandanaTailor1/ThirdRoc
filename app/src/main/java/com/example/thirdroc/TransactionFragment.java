package com.example.thirdroc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class TransactionFragment extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v= inflater.inflate(R.layout.fragment_transaction, container, false);
        tabLayout=v.findViewById(R.id.tablayout);
        viewPager=v.findViewById(R.id.viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("BNPL Transaction"));
        tabLayout.addTab(tabLayout.newTab().setText("EWA Transaction"));

        TransactionTabAdapter transactionTabAdapter=new TransactionTabAdapter(getActivity().getSupportFragmentManager(),getContext(),tabLayout.getTabCount());
        viewPager.setAdapter(transactionTabAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
              viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
       return v;
    }
}