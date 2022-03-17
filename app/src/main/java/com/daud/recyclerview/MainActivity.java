package com.daud.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView RecyclerView;
    private List<ModelClass> DataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView=findViewById(R.id.RecyclerView);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        DataList=new ArrayList<>();
        DataList.add(new ModelClass("A","0"));
        DataList.add(new ModelClass("B","1"));
        DataList.add(new ModelClass("C","2"));
        DataList.add(new ModelClass("D","3"));
        DataList.add(new ModelClass("E","4"));
        DataList.add(new ModelClass("F","5"));
        DataList.add(new ModelClass("G","6"));
        DataList.add(new ModelClass("H","7"));
        DataList.add(new ModelClass("I","8"));
        DataList.add(new ModelClass("J","9"));
        DataList.add(new ModelClass("K","10"));
        DataList.add(new ModelClass("L","11"));
        DataList.add(new ModelClass("M","12"));
        DataList.add(new ModelClass("N","13"));
        DataList.add(new ModelClass("O","14"));
        DataList.add(new ModelClass("P","15"));

        MyAdapter Adapter =new MyAdapter(this,DataList);
        RecyclerView.setAdapter(Adapter);
    }
}