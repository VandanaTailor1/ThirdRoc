package com.example.thirdroc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thirdroc.extra.SelectClickListner;
import com.example.thirdroc.modals.SelectItem;

import java.util.List;

public class SelectRecycle extends RecyclerView.Adapter<SelectRecycle.RecycleManagerSelect> {
    Context context;
    RadioButton radioButton;
    List<SelectItem> list;

    SelectClickListner selectClickListner;

    public SelectRecycle(Context context, List<SelectItem> list, SelectClickListner selectClickListner) {
        this.context = context;
        this.list = list;
        this.selectClickListner = selectClickListner;
    }

    @NonNull
    @Override
    public RecycleManagerSelect onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.select_store_recycler, parent, false);
        RecycleManagerSelect recycleManagerSelect = new RecycleManagerSelect(v);
        return recycleManagerSelect;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleManagerSelect holder, int position) {
        SelectItem selectItem = list.get(position);
        holder.txt1.setText(selectItem.getName());

        holder.itemView.setOnClickListener(v -> {
            if (holder.getAdapterPosition() != RecyclerView.NO_POSITION) {
                selectClickListner.onItemClick(holder.getAdapterPosition(), "");
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecycleManagerSelect extends RecyclerView.ViewHolder {
        TextView txt1;

        public RecycleManagerSelect(@NonNull View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.textrec);
            radioButton = itemView.findViewById(R.id.radi);
        }
    }
}
