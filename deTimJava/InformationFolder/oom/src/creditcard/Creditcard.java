package creditcard;

public class Creditcard {
    private int pin;
    private String typ;
    private double framework = 2000;

    //Constructor
    public Creditcard(int pin, String typ) {
        this.pin = pin;
        this.typ = typ;

    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getFramework() {
        return framework;
    }

    public void setFramework(double framework) {
        this.framework = framework;
    }

    public void inspectPIN() {
        System.out.println(pin);
    }

    public void showFramework() {
        System.out.println(framework);
    }

    @Override
    public String toString() {
        return "Creditcard{" +
                "pin=" + pin +
                ", typ='" + typ + '\'' +
                ", framework=" + framework +
                '}';
    }

    public static void main(String[] args) {

        Creditcard timDehler = new Creditcard(17012, "Mastercard");
        System.out.println(timDehler.getPin());
        timDehler.showFramework();

        System.out.println(timDehler);

    }

}
