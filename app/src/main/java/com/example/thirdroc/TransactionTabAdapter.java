package com.example.thirdroc;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TransactionTabAdapter extends FragmentPagerAdapter {

  private Context context;
  int tooltabs;

    public TransactionTabAdapter(FragmentManager fm ,Context context, int tooltabs) {
        super(fm);
        this.context=context;
        this.tooltabs=tooltabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
              TransactionFragment transactionFragment=new TransactionFragment();
              return transactionFragment;
            case 1:
                TransactionFragment transactionFragment1=new TransactionFragment();
                return transactionFragment1;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return tooltabs;
    }
}
