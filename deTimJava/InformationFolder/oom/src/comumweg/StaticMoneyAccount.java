package comumweg;

public class StaticMoneyAccount extends InvestAccount {

    private int runtime;

    public StaticMoneyAccount(int accNumber, double accBalance, double interest, int runtime) {
        super(accNumber, accBalance, interest);
        this.runtime = runtime;
    }

    public void addInterest() {
        for (int i = 0; i <= runtime; i++) {
            System.out.println("With your current account Balance you recieve a interest of: " + getInterest() + "%!");
            setAccBalance(getAccBalance() + (getAccBalance() * getInterest() / 100));
        }
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "StaticMoneyAccount{" +
                ", accNumber=" + getAccNumber() +
                ", accBalance=" + getAccBalance() +
                ", interest=" + getInterest() +
                ", runtime=" + runtime +
                '}';
    }
}
