package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {
    private BibliotecaApp app = new BibliotecaApp();

    @Test
    public void getWelcomeMessage() {
        assertEquals(app.getTitle(),"welcome");
    }


    @Test
    public void bookIsSuccessfullyAdded() {
        Book mybook = new Book("Test Driven Development by Example", "Kent Beck");
        app.addBook(mybook);
        ArrayList<Book> bookList = app.getBooks();
        assertTrue(bookList.contains(mybook));
    }

    @Test
    public void hasTitleAndAuthor() {
        Book mybook = new Book("Test Driven Development by Example", "Kent Beck");
        app.addBook(mybook);
        ArrayList<Book> asd = app.getBooks();
        assertEquals(asd.get(0).getTitle(), "Test Driven Development by Example");
        assertEquals(asd.get(0).getAuthor(), "Kent Beck");
    }
}
