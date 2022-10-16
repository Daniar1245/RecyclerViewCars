package com.geektech.recyclerviewcars;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCarsType;
    public CarsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCarsType =itemView.findViewById(R.id.TV_CarsType);
    }
    public void bind (String menu){tvCarsType.setText(menu);
    }
}
