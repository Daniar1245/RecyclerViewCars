package com.geektech.recyclerviewcars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView CarsTypeRecyclerView;
    private ArrayList<String> CarsTypeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarsTypeRecyclerView = findViewById(R.id.RecycleViewCars);
        CarsTypeList.add("BUGATTI");
        CarsTypeList.add("FERRARI");
        CarsTypeList.add("VOLKSWAGEN");
        CarsTypeList.add("TOYOTA");
        CarsTypeList.add("OPEL");
        CarsTypeList.add("SUBARU");
        CarsTypeList.add("MERCEDES");
        CarsTypeList.add("BMW");
        CarsTypeList.add("LEXSUS");
        CarsTypeList.add("MUSTANG");
        CarsTypeList.add("FORD");
        CarsTypeList.add("KIA");
        CarsTypeList.add("BENTLEY");
        CarsTypeList.add("ALFA ROMEO");
        CarsTypeList.add("TESLA");
        CarsTypeList.add("JEEP");
        CarsTypeList.add("HONDA");
        CarsTypeList.add("HYUNDAI");
        CarsTypeList.add("CHEVROLET");
        CarsTypeList.add("CADILLAC");
        CarsTypeList.add("NISSAN");
        AdapterCarsType adapter = new AdapterCarsType();
        CarsTypeRecyclerView.setAdapter(adapter);
    }
}