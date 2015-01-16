package com.twu.biblioteca;

public class Book {
    public String title;
    private String author;
    private boolean checkedOut = false;

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle () {
        return title;
    }
    public Boolean onLoan () { return checkedOut; }
    public String getAuthor () {
        return author;
    }

    public boolean putOnLoan () {
        if(!onLoan()){
            checkedOut = true;
            return true;
        }
        else return false;
    }
    public boolean putOnHire () {
        if(onLoan()){
            checkedOut = false;
            return true;
        }
        else return false;
    }
}
