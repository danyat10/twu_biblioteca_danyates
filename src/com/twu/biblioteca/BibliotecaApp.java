package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private ArrayList<Book> bookList = new ArrayList<Book>();

    public static void main(String[] args) {

    }

    public String getTitle () {
        return "welcome";
    }

    public ArrayList<Book> getBooks(){
        return bookList;
    }

    public void addBook (Book bookToAdd) {
        bookList.add(bookToAdd);
    }


}


