package comumweg;

public abstract class InvestAccount extends Account {

    public double interest;

    public InvestAccount(int accNumber, double accBalance, double interest) {
        super(accNumber, accBalance);
        this.interest = interest;
    }

    public InvestAccount(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
