package com.twu.biblioteca;

public class Book {
    public String title;
    private String author;

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle () {
        return title;
    }

    public String getAuthor () {
        return author;
    }

}
