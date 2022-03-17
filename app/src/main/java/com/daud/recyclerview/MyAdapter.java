package com.daud.recyclerview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import javax.sql.DataSource;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private Context context;
    private List<ModelClass> DataSource;

    public MyAdapter(Context context, List<ModelClass> dataSource) {
        this.context = context;
        DataSource = dataSource;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.viewholder_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      holder.nameTV.setText(DataSource.get(position).getName());
      holder.amountTV.setText(DataSource.get(position).getAmount());
    }

    @Override
    public int getItemCount() {
        return DataSource.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTV,amountTV;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.nameTv);
            amountTV = itemView.findViewById(R.id.amountTV);
        }
    }
}