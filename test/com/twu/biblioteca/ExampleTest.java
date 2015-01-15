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
    public void getListOfBooks() {
        assertEquals(true, app.getBooks());
    }

    @Test
    public void getBookWithTitleAndAuthor() {
        Book mybook = new Book("Test Driven Development by Example", "Kent Beck");
        app.addBook(mybook);
        ArrayList<Book> bookList = app.getBooks();
        assertTrue(bookList.contains(mybook));
    }

}
