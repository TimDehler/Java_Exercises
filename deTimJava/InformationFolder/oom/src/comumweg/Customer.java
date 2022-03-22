package comumweg;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private String name;
    private String address;
    private String phoneNumber;
    private final Map<Integer, Account> bankAccounts;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankAccounts = new HashMap<>();
    }

    public Account getAccount(int accountNumber) {
        return bankAccounts.get(accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccount(Account account) {
        if (bankAccounts.size() < 9) {
            bankAccounts.put(account.getAccNumber(), account);
        } else {
            System.out.println("You have too many accounts!");
        }
    }

    public String showAccs() {
        return "Customer{" +
                "bankAccounts=" + bankAccounts +
                "}\n";
    }

    public Map<Integer, Account> getBankAccounts() {
        return bankAccounts;
    }

    @Override
    public String toString() {
        return "New customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
