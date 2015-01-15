package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
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
        assertEquals(lib.getBooks().size(), 3);
    }

    @Test
    public void can_set_and_get_title () {
        lib.setTitle("Welcome to Bangalore Library");
        assertEquals(lib.getTitle(), "Welcome to Bangalore Library");
    }


    @Test
    public void is_4_when_book_is_added_to_library () {
        Book mybook = new Book("Harry Potter Order of the Phoenix", "J.K Rowling");
        lib.addBook(mybook);
        ArrayList<Book> bookList = lib.getBooks();
        assertEquals(lib.getBooks().size(), 4);
    }

    @Test
    public void is_2_when_book_is_removed_from_library () {
        ArrayList<Book> bookList = lib.getBooks();
        lib.removeBook(bookList.get(0));
        assertEquals(lib.getBooks().size(), 2);
    }

    @Test
    public void has_title_and_author_present () {
        Book mybook = new Book("Test Driven Development by Example", "Kent Beck");
        lib.addBook(mybook);
        ArrayList<Book> aBook = lib.getBooks();
        assertEquals(aBook.get(0).getTitle(), "Test Driven Development by Example");
        assertEquals(aBook.get(0).getAuthor(), "Kent Beck");
    }

    @Test
    public void can_get_and_set_menu_title () {
        lib.setTitle("");
    }

    /*@Test
    public void is_true_if_book_can_be_lended () {
        ArrayList<Book> aBook = lib.getBooks();
        aBook.get(0).isLendable(null);
        ArrayList<Book> aBook = app.getBooks();
    }*/
}
