package author;

import java.util.Scanner;

public class AppBook {
    public static void main(String[] args) {

        /*
        Author jkRowling = new Author("JkRowling");
        jkRowling.setGage(100.0);
        jkRowling.setSynonym("JK");
        System.out.println(jkRowling.toString());

        Book harryPotter = new Book("Harry Potter", 20319283, 25.0, jkRowling, "BEL-23-12");
        System.out.println(harryPotter.toString());
        */

        Bibliothek bibliothek = new Bibliothek("Zentralbibliothek Fulda", "Petersberger Straße 14");
        AppBook appBook = new AppBook();
        //appBook.menu(bibliothek);
        appBook.perAnhalter();
    }

    public void menu(Bibliothek bibliothek) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put in 1 or 2");
        System.out.println("""
                1. Create book
                2. Remove book
                3. Show all books
                """);
        if (scanner.nextLine().equals("1")) {
            bibliothek.createBook();
            menu(bibliothek);
        } else if (scanner.nextLine().equals("2")) {
            bibliothek.removeBook();
            menu(bibliothek);
        }else if(scanner.nextLine().equals("3")){
            bibliothek.printBookList();
            menu(bibliothek);
        }
    }
    public void perAnhalter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in the authors name");
        Author author = new Author(scanner.nextLine());
        author.setSynonym("DD");
        author.setGage(100.0);
        System.out.println("Put in name");
        String name = scanner.nextLine();
        System.out.println("Put in location");
        String location = scanner.nextLine();
        System.out.println("Put in isbn");
        long isbn = scanner.nextLong();
        System.out.println("Put in price");
        double price = scanner.nextDouble();
        Book book = new Book(name, isbn, price, location, author);
        System.out.println(book.toString());
    }
}
