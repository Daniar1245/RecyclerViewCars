package com.geektech.recyclerviewcars;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCarsType extends RecyclerView.Adapter<CarsViewHolder> {
    private ArrayList<String> CarsTypeList;
    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cars_type, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
        holder.bind(CarsTypeList.get(position));
    }

    @Override
    public int getItemCount() {
        return CarsTypeList.size();
    }
}
