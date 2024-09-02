package com.example.pocketbook;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    ArrayList<BooksModel> booksModels =    new ArrayList<>() ;
    int[] bookImages = {R.drawable.book1 , R.drawable.book2 , R.drawable.book3 , R.drawable.book4 , R.drawable.book5 , R.drawable.book6 , R.drawable.book7 , R.drawable.book8 ,
                        R.drawable.book9 , R.drawable.book10 , R.drawable.book11 , R.drawable.book12 , R.drawable.book13 , R.drawable.book14 , R.drawable.book15 ,
                        R.drawable.book16  , R.drawable.book17 , R.drawable.book18 , R.drawable.book19 , R.drawable.book20 , R.drawable.book21} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        private void setUpBooksModels() {
            String[] booksNames = getResources().getStringArray(R.array.book_names) ;
            String[] authorNames = getResources().getStringArray(R.array.author_names);
            String[] availability = getResources().getStringArray(R.array.availability);

            for ( int i = 0 ; i<booksNames.length; i++ ){
                booksModels.add(new BooksModel(booksNames[i] , authorNames[i] , availability[i]
                 , bookImages[i])) ;
            }
        }
    }
}