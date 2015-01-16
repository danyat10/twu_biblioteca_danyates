package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BibliotecaAppTest {

    Library lib;

    @Before
    public void returns_books_passed_in (){
        Book bookA = new Book("Test Driven Development by Example", "Kent Beck");
        Book bookB = new Book("Head First Java", "Kathy Sierra & Bert Bates");
        Book bookC = new Book("Stig of the Dump", "Clive King");

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(bookA);
        books.add(bookB);
        books.add(bookC);

        lib = new Library(books);
        assertEquals(lib.getAllBooks().size(), 3);
    }

    @Test
    public void can_set_and_get_title () {
        lib.setTitle("Welcome to Bangalore Library");
        assertThat(lib.getTitle(), containsString("Welcome to Bangalore Library"));
    }


    @Test
    public void is_4_when_book_is_added_to_library () {
        Book mybook = new Book("Harry Potter Order of the Phoenix", "J.K Rowling");
        lib.addBook(mybook);
        ArrayList<Book> bookList = lib.getAllBooks();
        assertEquals(lib.getAllBooks().size(), 4);
    }

    @Test
    public void is_2_when_book_is_removed_from_library () {
        ArrayList<Book> bookList = lib.getAllBooks();
        lib.removeBook(bookList.get(0));
        assertEquals(lib.getAllBooks().size(), 2);
    }

    @Test
    public void has_title_and_author_present () {
        Book mybook = new Book("Test Driven Development by Example", "Kent Beck");
        lib.addBook(mybook);
        Book particularBook = lib.getBook(0);
        assertEquals(particularBook.getTitle(), "Test Driven Development by Example");
        assertEquals(particularBook.getAuthor(), "Kent Beck");
    }

    @Test
    public void shows_list_of_available_commands () {
        assertThat(lib.displayMenuOptions(), containsString("L) List Books\n"));
    }

    /*@Test
    public void can_get_user_input () {
        //Try typing L in the command prompt.
        assertEquals(lib.getInput("Please enter choice"), "L");
    }*/

    @Test
    public void if_menu_option_is_invalid_show_error_message () {
        String userInput = "sadsad"; //should be 'L'
        assertEquals(lib.runMenuCommand(userInput), "Select a valid option!");
    }

    @Test
    public void loop_through_all_two_commands_until_termination () {
        int timesRun = -1;
        String command = "LLLQL";
        String[] array = command.split("");

        do {
            timesRun++;
            lib.runMenuCommand(array[timesRun]);
        }
        while (!lib.hasQuit());

        assertEquals(4, timesRun);
    }


    @Test
    public void two_books_left_when_a_book_is_checked_out () {
        assertThat(lib.checkout(lib.getBook(0)), containsString("Thank you! Enjoy the book"));
        ArrayList<Book> aBook = lib.getAllBooks();
        assertEquals(2, aBook.size());

    }

    @Test
    public void three_books_left_when_user_tries_to_checkout_an_unavailable_book () {
        lib.getBook(0).checkout();
        assertThat(lib.checkout(lib.getBook(0)), containsString("That book is not available."));
        ArrayList<Book> aBook = lib.getAllBooks();
        assertEquals(3, aBook.size());
    }
}
