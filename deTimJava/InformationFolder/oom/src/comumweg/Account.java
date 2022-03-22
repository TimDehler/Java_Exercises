package comumweg;

import java.util.Scanner;

public abstract class Account {

    private int accNumber;
    private double accBalance;

    Scanner scanner = new Scanner(System.in);

    public Account(int accNumber, double accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    public Account() {
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", accBalance=" + accBalance +
                '}';
    }

    public void deposit(double moneyAm) {
        setAccBalance(moneyAm + getAccBalance());
        System.out.println("You just deposited " + moneyAm + "$ into your bank account!");
    }

    public void withdraw(double moneyAm) {
        setAccBalance(getAccBalance() - moneyAm);
        System.out.println("You just withdrawed " + moneyAm + "$ from your bank account!");
    }
}
