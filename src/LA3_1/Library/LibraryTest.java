package LA3_1.Library;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @org.junit.jupiter.api.Test
    void displayAllBookTitles() {

    }

    @org.junit.jupiter.api.Test
    void borrowByTitle() {
        Book book = new Book("Harry Potter", "JK Rowling", "IDK");
        Library lib = new Library();
        lib.books.add(book);
        lib.borrowByTitle("Harry Potter");
        assertFalse(book.isAvailable);
    }

    @org.junit.jupiter.api.Test
    void returnByTitle() {
        Book book = new Book("Harry Potter", "JK Rowling", "IDK");
        Library lib = new Library();
        lib.books.add(book);
        lib.borrowByTitle("Harry Potter");
        assertFalse(book.isAvailable);
        lib.returnByTitle("Harry Potter");
        assertTrue(book.isAvailable);
    }
}