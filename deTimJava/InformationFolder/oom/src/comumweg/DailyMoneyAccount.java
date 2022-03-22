package comumweg;

public class DailyMoneyAccount extends InvestAccount {

    public DailyMoneyAccount(int accNumber, double accBalance, double interest) {
        super(accNumber, accBalance, interest);
    }

    @Override
    public double getInterest() {
        if (getAccBalance() >= 1000) {
            setInterest(100.0);
        } else if (getAccBalance() <= 0) {
            setInterest(0.0);
        } else {
            setInterest(50.0);
        }
        return interest;
    }

    public void addInterest() {
        System.out.println("With your current account Balance you recieve a interest of: " + getInterest() + "%!");
        setAccBalance(getAccBalance() + (getAccBalance() * getInterest() / 100));
    }

    @Override
    public String toString() {
        return "DailyMoneyAccount{" +
                "accNumber=" + getAccNumber() +
                ", accBalance=" + getAccBalance() +
                ", interest=" + getInterest() + "%" +
                '}';
    }
}
