package com.example.pocketbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BooksRecyclerViewAdapter extends RecyclerView.Adapter<BooksRecyclerViewAdapter.MyViewHolder> {

    Context context ;
    ArrayList<BooksModel> booksModels ;


    public BooksRecyclerViewAdapter(Context context , ArrayList<BooksModel> booksModels){
        this.context = context ;
        this.booksModels = booksModels ;
    }

    @NonNull
    @Override
    public BooksRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // This is where you inflate the layout (Giving a look to our rows)
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.books_views, parent , false );
        return BooksRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BooksRecyclerViewAdapter.MyViewHolder holder, int position) {
        // assigning to the views we created in the recycler_view_row layout file
        // based on the position of the recycler view

        holder.tvBookName.setText(booksModels.get(position).getBookName());
        holder.tvAuthorName.setText(booksModels.get(position).getAuthor());
        holder.tvAvailability.setText(booksModels.get(position).getAvaialability());
        holder.imageView.setImageResource(booksModels.get(position).getBookImage());
    }

    @Override
    public int getItemCount() {
       // the recycler view just wants to know the number of items you want displayed
        return booksModels.size();
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
