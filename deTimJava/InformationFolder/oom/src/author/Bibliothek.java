package author;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliothek {

    Scanner scanner = new Scanner(System.in);

    private ArrayList<Book> bookList = new ArrayList<Book>();

    public Bibliothek(String name, String adresse) {
    }

    Author jkRowling = new Author("JkRowling");

    public void createBook() {
        Book book = new Book("Harry Potter", 1 + (int) (Math.random() * 1000), 25.0, "DEL-15_23", jkRowling);
        bookList.add(book);
        printBookList();
    }

    public void printBookList() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
    }

    public void removeBook() {
        System.out.println("Put in the number of the book you wish to remove: ");
        int i = scanner.nextInt();
        bookList.remove(i);
        printBookList();

    }
}
