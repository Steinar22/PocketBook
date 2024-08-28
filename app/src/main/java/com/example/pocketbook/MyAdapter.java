package com.example.pocketbook;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {

   private int bookImg ;
    private  String bookName ;
    private String author ;
    private boolean availability ;

    @Override
    public  MyViewHolder onCreateViewHolder(view)

