package com.example.thirdroc;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleTransaction extends RecyclerView.Adapter<RecycleTransaction.RecycleHolder> {

    @NonNull
    @Override
    public RecycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecycleHolder extends RecyclerView.ViewHolder{

        public RecycleHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
