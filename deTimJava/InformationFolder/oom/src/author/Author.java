package author;

public class Author {

    private final String name;
    private String synonym;
    private double gage;

    public Author(String name) {
        this.name = name;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public void setGage(double gage) {
        this.gage = gage;
    }

    public String getName() {
        return name;
    }

    public String getSynonym() {
        return synonym;
    }

    public double getGage() {
        return gage;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", synonym='" + synonym + '\'' +
                ", gage=" + gage +
                '}';
    }
}
