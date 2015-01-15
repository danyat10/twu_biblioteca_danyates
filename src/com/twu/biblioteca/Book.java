package com.twu.biblioteca;

public class Book {
    public String title;
    private String author;
    private Boolean isLendable = true;

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

    public boolean setLendable () {
        this.isLendable = false;
        return false;
    }
    public boolean isLendable () {
        this.isLendable = true;
        return true;
    }
}
