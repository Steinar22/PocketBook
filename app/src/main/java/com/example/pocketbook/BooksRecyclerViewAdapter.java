package com.example.pocketbook;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksRecyclerViewAdapter extends RecyclerView.Adapter<BooksRecyclerViewAdapter.MyViewHolder> {
    @NonNull
    @Override
    public BooksRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // This is where you inflate the layout (Giving a look to our rows)
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BooksRecyclerViewAdapter.MyViewHolder holder, int position) {
        // assigning to the views we created in the recycler_view_row layout file
        // based on the position of the recycler view
    }

    @Override
    public int getItemCount() {
       // the recycler view just wants to know the number of items you want displayed
        return 0;
    }

    public  static class MyViewHolder extends RecyclerView.ViewHolder{
        // grabbing the views from our recycler_view_row layout file
        // kinda like in the onCreate method
        ImageView imageView ;
        TextView tvBookName , tvAuthorName , tvAvailability ;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.bookImage);
            tvBookName = itemView.findViewById(R.id.bookName);
            tvAuthorName = itemView.findViewById(R.id.authorName);
            tvAvailability = itemView.findViewById(R.id.availability);

        }
    }
}
