package com.example.consultordecerveja_feliperrezende;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView marcaView;
    public MyViewHolder (@NonNull @org.jetbrains.annotations.NotNull View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        marcaView= itemView.findViewById(R.id.marca);
    }
}
