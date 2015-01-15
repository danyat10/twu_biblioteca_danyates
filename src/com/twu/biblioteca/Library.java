package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library {
    private String title;
    private ArrayList<Book> bookList;

    //Constructor
    public Library (ArrayList<Book> books) {
        bookList = books;
    }


    //Setters and getters for title
    public void setTitle (String newTitle) {
        title = newTitle;
    }
    public String getTitle () {
        return title;
    }

    //Book functionality
    public ArrayList<Book> getAllBooks(){
        return bookList;
    }
    public Book getBook(int index) {
        return bookList.get(index);
    }
    public void addBook (Book bookToAdd) {
        bookList.add(bookToAdd);
    }
    public void removeBook (Book bookToRemove) {
        bookList.remove(bookToRemove);
    }

    public String displayMenuOptions () {
        String menuText = "== Menu Options ==\n";
        menuText += "L) List Books\n";

        System.out.println(menuText);
        return menuText;
    }

    public String getInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }
        catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine.toLowerCase();
    }

    public String runMenuCommand(String cmd) {
        if(cmd == "S") {
            System.out.println("Showing all books...");
            return "shows all books";
        }
        else {
            System.out.println("Select a valid option!");
            return "Select a valid option!";
        }
    }

}
