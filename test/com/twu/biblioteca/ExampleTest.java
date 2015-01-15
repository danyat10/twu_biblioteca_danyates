package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {

    @Test
    public void getWelcomeMessage() {
        BibliotecaApp app = new BibliotecaApp();
        assertEquals(app.getTitle(),"welcome");
    }

    @Test
    public void seeListOfBooks() {
        BibliotecaApp app = new BibliotecaApp();
        assertEquals(true, app.getBookList());
    }

}
