package author;

public class Book {

    private final String title;
    private final long isbn;
    private double price;
    private Author author;
    private String location;

    public Book(String title, long isbn, double price, String location, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.location = location;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                ", location='" + location +
                ", author=" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public long getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
