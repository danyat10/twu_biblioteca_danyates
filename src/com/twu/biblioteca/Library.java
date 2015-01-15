package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private String title;
    private ArrayList<Book> bookList;

    public Library (ArrayList<Book> books) {
        bookList = books;
    }

    public void setTitle (String newTitle) {
        title = newTitle;
    }
    public String getTitle () {
        return title;
    }


    public ArrayList<Book> getBooks(){
        return bookList;
    }

    public void addBook (Book bookToAdd) {
        bookList.add(bookToAdd);
    }
    public void removeBook (Book bookToRemove) {
        bookList.remove(bookToRemove);
    }
}
