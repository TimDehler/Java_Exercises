package viewManagement;

public class Customer {

    private String name;
    private  String mail;
    private int blz;
    private int accNumber;

    public Customer(String name, String mail, int blz, int accNumber) {
        this.name = name;
        this.mail = mail;
        this.blz = blz;
        this.accNumber = accNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", blz=" + blz +
                ", accNumber=" + accNumber +
                '}';
    }
}
