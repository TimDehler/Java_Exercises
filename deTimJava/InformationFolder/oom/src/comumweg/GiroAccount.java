package comumweg;

public class GiroAccount extends Account {

    private double creditFrame;
    private String giroCard;
    private int bonusPayment;

    public GiroAccount(int accNumber, double accBalance, double creditFrame, String giroCard, int bonusPayment) {
        super(accNumber, accBalance);
        this.creditFrame = creditFrame;
        this.giroCard = giroCard;
        this.bonusPayment = bonusPayment;
    }

    public GiroAccount(double creditFrame, String giroCard, int bonusPayment) {
        this.creditFrame = creditFrame;
        this.giroCard = giroCard;
        this.bonusPayment = bonusPayment;
    }

    public GiroAccount(int accNumber, double accBalance) {
        super(accNumber, accBalance);
    }

    public double getCreditFrame() {
        return creditFrame;
    }

    public void setCreditFrame(double creditFrame) {
        this.creditFrame = creditFrame;
    }

    public String getGiroCard() {
        return giroCard;
    }

    public void setGiroCard(String giroCard) {
        this.giroCard = giroCard;
    }

    public double getBonusPayment() {
        return bonusPayment;
    }

    public void setBonusPayment(int bonusPayment) {
        this.bonusPayment = bonusPayment;
    }

    @Override
    public void deposit(double moneyAm) {
        moneyAm = moneyAm * (100 + bonusPayment) / 100;
        super.deposit(moneyAm);
        System.out.println("Because of your giro account you get a bonus deposit of:" + bonusPayment + "%!");
    }

    @Override
    public String toString() {
        return "GiroAccount{" +
                " accNumber=" + getAccNumber() +
                ", accBalance=" + getAccBalance() +
                ", creditFrame=" + creditFrame +
                ", giroCard='" + giroCard +
                ", bonusPayment=" + bonusPayment +
                '}';
    }

    public void getCredit(int moneyAm) {
        if (moneyAm > getCreditFrame()) {
            System.out.println("You can not have a credit as high as that!");
        } else if (moneyAm <= 0) {
            System.out.println("You do not even want money?");
        } else {
            System.out.println("Heres your credit:");
            deposit(moneyAm);
        }
    }
}
