package articel;

public class Article {

    private double price;
    private String name;
    private int shelfNumber;

    //Constructor
    public Article(double price, String name, int shelfNumber) {
        this.price = price;
        this.name = name;
        this.shelfNumber = shelfNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public double calculateTax() {
        price = price * 119 / 100;
        price = price * 100;
        price = (int) price;
        price = (double) price / 100;
        return price;
    }

    public static void main(String[] args) {

        Article ham = new Article(2.90, "meller", 1756);
        System.out.println(ham.calculateTax());
        Article salad = new Article(0.40, "kopfsalat", 1821);
        System.out.println(salad.calculateTax());
        Article mushrooms = new Article(6.70, "shitakee", 1283);
        System.out.println(mushrooms.calculateTax());

    }
}
