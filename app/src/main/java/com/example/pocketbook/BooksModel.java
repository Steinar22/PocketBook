package com.example.pocketbook;

public class BooksModel {

    String bookName ;
    String  author ;
    String avaialability ;
    int bookImage ;


    public BooksModel(String bookName, String author, String avaialability, int bookImage) {
        this.bookName = bookName;
        this.author = author;
        this.avaialability = avaialability;
        this.bookImage = bookImage;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getAvaialability() {
        return avaialability;
    }

    public int getBookImage() {
        return bookImage;
    }
}
