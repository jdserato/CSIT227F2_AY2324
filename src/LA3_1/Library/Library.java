package LA3_1.Library;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void displayAllBookTitles() {
        for (Book book : books) {
            System.out.println(book.title);
        }
    }

    public void borrowByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.equals(title)) {
                found = true;
                if (book.isAvailable) {
                    book.borrow();
                    System.out.println("Book " + book.title + " has been borrowed.");
                } else {
                    System.out.println("Book " + book.title + " has already been borrowed.");
                }
            }
        }
        if (!found) {
            System.out.println("Book Test Title not found.");
        }
    }

    public void returnByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.equals(title)) {
                found = true;
                if (!book.isAvailable) {
                    book.returnBook();
                    System.out.println("Book " + book.title + " has been returned.");
                } else {
                    System.out.println("Book " + book.title + " has not been borrowed.");
                }
            }
        }
        if (!found) {
            System.out.println("Book Test Title not found.");
        }
    }
}
