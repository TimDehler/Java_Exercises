package viewManagement;

public class View {

    private String title;
    private String rubric;
    private String description;
    private double price;
    private String imageName;

    public View() {
    }

    @Override
    public String toString() {
        return "View{" +
                "title='" + title + '\'' +
                ", rubric='" + rubric + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageName='" + imageName + '\'' +
                '}';
    }

    public View(String title, String rubric, String description, double price, String imageName) {
        this.title = title;
        this.rubric = rubric;
        this.description = description;
        this.price = price;
        this.imageName = imageName;


    }
}
