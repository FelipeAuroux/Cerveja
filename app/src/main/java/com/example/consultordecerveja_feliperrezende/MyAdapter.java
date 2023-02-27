package com.example.consultordecerveja_feliperrezende;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>
{
    Context context;
    List<listagem> items;

    public MyAdapter(Context context, List<listagem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.listagem_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.marcaView.setText(items.get(position).getMarcaCerveja());
        holder.imageView.setImageResource(items.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
