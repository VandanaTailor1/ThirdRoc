package com.example.thirdroc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeRecycle extends RecyclerView.Adapter<HomeRecycle.ManagerViewHolder> {

    Context context;
    List<String> list1;

    public HomeRecycle(Context context, List<String> list1) {
        this.context = context;
        this.list1 = list1;
    }

    @NonNull
    @Override
    public ManagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_recycle,parent,false);
        ManagerViewHolder managerViewHolder=new ManagerViewHolder(view);
        return managerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ManagerViewHolder holder, int position) {
        holder.amzntxt.setText(list1.get(position));
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class ManagerViewHolder extends RecyclerView.ViewHolder {
           TextView amzntxt;
        public ManagerViewHolder(@NonNull View itemView) {
            super(itemView);
          amzntxt=itemView.findViewById(R.id.amzntxt);

        }
    }

}
