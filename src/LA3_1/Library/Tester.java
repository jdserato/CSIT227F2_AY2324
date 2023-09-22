package LA3_1.Library;

import java.util.*;
import java.lang.reflect.*;

public class Tester {

    private static Method getMethod(Object obj, String methodName) {
        Method[] methods = obj.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals(methodName)) {
                return m;
            }
        }
        return null;
    }

    public Tester() {}
    public static void test (Library library) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        int code = Integer.parseInt(sc.nextLine());

        if (code == 1) {
            String testTitle = "Test Title";
            String testAuthor = "Test Author";
            String testPublisher = "Test Publisher";
            boolean testIsAvailable = true;

            Book testBook = new Book(testTitle, testAuthor, testPublisher);

            if (testBook.title == testTitle && testBook.author == testAuthor && testBook.publisher == testPublisher && testBook.isAvailable == testIsAvailable) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        }

        else if (code == 2) {
            String testTitle = "Harry Potter";
            String testAuthor = "JK Rowling";
            String testPublisher = "Bloomsbury";

            Book testBook = new Book(testTitle, testAuthor, testPublisher);

            Method displayInfo = Tester.getMethod(testBook, "displayInfo");
            Method borrow = Tester.getMethod(testBook, "borrow");
            Method returnBook = Tester.getMethod(testBook, "returnBook");

            try {
                displayInfo.invoke(testBook);
                System.out.println("Is Available = " + testBook.isAvailable);
                borrow.invoke(testBook);
                System.out.println("Is Available = " + testBook.isAvailable);
                returnBook.invoke(testBook);
                System.out.println("Is Available = " + testBook.isAvailable);
                System.out.println("SUCCESS");
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 3) {
            Library newLibrary = new Library();
            ArrayList<Book> testBooks = new ArrayList<Book>();

            if (newLibrary.books.equals(testBooks)) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        }

        else if (code == 4) {
            String testTitle = "Harry Potter";
            String testAuthor = "JK Rowling";
            String testPublisher = "Bloomsbury";

            Book testBook = new Book(testTitle, testAuthor, testPublisher);

            library.books.add(testBook);

            Method displayAllBookTitles = Tester.getMethod(library, "displayAllBookTitles");
            Method borrowByTitle = Tester.getMethod(library, "borrowByTitle");
            Method returnByTitle = Tester.getMethod(library, "returnByTitle");

            try {
                displayAllBookTitles.invoke(library);
                borrowByTitle.invoke(library, testTitle);
                returnByTitle.invoke(library, testTitle);
                System.out.println("SUCCESS");
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 5) {
            String testTitle = "Harry Potter";
            String testAuthor = "JK Rowling";
            String testPublisher = "Bloomsbury";

            Book testBook = new Book(testTitle, testAuthor, testPublisher);

            library.books.add(testBook);

            Method displayAllBookTitles = Tester.getMethod(library, "displayAllBookTitles");
            Method borrowByTitle = Tester.getMethod(library, "borrowByTitle");
            Method returnByTitle = Tester.getMethod(library, "returnByTitle");

            try {
                displayAllBookTitles.invoke(library);
                borrowByTitle.invoke(library, testTitle);
                borrowByTitle.invoke(library, testTitle);
                returnByTitle.invoke(library, testTitle);
                returnByTitle.invoke(library, testTitle);
                System.out.println("SUCCESS");
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 6) {
            String testTitle1 = "Harry Potter";
            String testAuthor1 = "JK Rowling";
            String testPublisher1 = "Bloomsbury";

            String testTitle2 = "The Fault in Our Stars";
            String testAuthor2 = "John Green";
            String testPublisher2 = "Dutton Books";


            String testTitle3 = "Atomic Habits";
            String testAuthor3 = "James Clear";
            String testPublisher3 = "Random House Publishing Group";


            Book testBook1 = new Book(testTitle1, testAuthor1, testPublisher1);
            Book testBook2 = new Book(testTitle2, testAuthor2, testPublisher2);
            Book testBook3 = new Book(testTitle3, testAuthor3, testPublisher3);

            library.books.add(testBook1);
            library.books.add(testBook2);
            library.books.add(testBook3);

            Method displayAllBookTitles = Tester.getMethod(library, "displayAllBookTitles");

            try {
                displayAllBookTitles.invoke(library);
                System.out.println("SUCCESS");
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 7) {
            String testTitle1 = "Harry Potter";
            String testAuthor1 = "JK Rowling";
            String testPublisher1 = "Bloomsbury";

            String testTitle2 = "The Fault in Our Stars";
            String testAuthor2 = "John Green";
            String testPublisher2 = "Dutton Books";


            String testTitle3 = "Atomic Habits";
            String testAuthor3 = "James Clear";
            String testPublisher3 = "Random House Publishing Group";


            Book testBook1 = new Book(testTitle1, testAuthor1, testPublisher1);
            Book testBook2 = new Book(testTitle2, testAuthor2, testPublisher2);
            Book testBook3 = new Book(testTitle3, testAuthor3, testPublisher3);

            library.books.add(testBook1);
            library.books.add(testBook2);
            library.books.add(testBook3);

            Method borrowByTitle = Tester.getMethod(library, "borrowByTitle");

            try {
                borrowByTitle.invoke(library, testTitle1);
                borrowByTitle.invoke(library, testTitle1);
                borrowByTitle.invoke(library, "Test Title");
                System.out.println("SUCCESS");
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 8) {
            String testTitle1 = "Harry Potter";
            String testAuthor1 = "JK Rowling";
            String testPublisher1 = "Bloomsbury";

            String testTitle2 = "The Fault in Our Stars";
            String testAuthor2 = "John Green";
            String testPublisher2 = "Dutton Books";


            String testTitle3 = "Atomic Habits";
            String testAuthor3 = "James Clear";
            String testPublisher3 = "Random House Publishing Group";


            Book testBook1 = new Book(testTitle1, testAuthor1, testPublisher1);
            Book testBook2 = new Book(testTitle2, testAuthor2, testPublisher2);
            Book testBook3 = new Book(testTitle3, testAuthor3, testPublisher3);

            library.books.add(testBook1);
            library.books.add(testBook2);
            library.books.add(testBook3);

            Method borrowByTitle = Tester.getMethod(library, "borrowByTitle");
            Method returnByTitle = Tester.getMethod(library, "returnByTitle");


            try {
                borrowByTitle.invoke(library, testTitle1);
                borrowByTitle.invoke(library, testTitle1);
                borrowByTitle.invoke(library, "Test Title");
                returnByTitle.invoke(library, testTitle1);
                returnByTitle.invoke(library, testTitle1);
                returnByTitle.invoke(library, "Test Title");
                System.out.println("SUCCESS");
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }
    }
}