package com.twu.biblioteca;

public class Book {
    public String title;
    private String author;
    private int libraryRef = 0;
    private boolean checkedOut = false;

    public Book (String title, String author, int LibraryReference){
        this.libraryRef = LibraryReference;
        this.title = title;
        this.author = author;
    }

    public String getTitle () {
        return title;
    }
    public Boolean onLoan () {
        return checkedOut; }
    public String getAuthor () {
        return author;
    }
    public int getBookRef() {
        return libraryRef;
    }
    public void setLibraryRef(int referenceNo) {
        this.libraryRef = referenceNo;
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
