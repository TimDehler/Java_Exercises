package comumweg;

import java.awt.*;
import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);
    Customer customer = null;
    Account currentAcc;

    public Test() {

    }

    /*
        + Abfangen falls falsche Kontonummer eingegeben wird
        +

     */

    //Main Method
    public static void main(String[] args) {
        Test test = new Test();
        test.createBankAccount(test.createCustomer());
    }

    //Creating a customer who creates and owns bank accounts
    public Customer createCustomer() {
        String name = null;
        String address = null;
        String phoneNumber = null;

        System.out.println("Do you wish to create a customer? Type: Yes! or No!");
        if (scanner.nextLine().equals("Yes!")) {
            System.out.println("Put in your name");
            name = scanner.nextLine();
            System.out.println("Put in your address");
            address = scanner.nextLine();
            System.out.println("Put in your phone number");
            phoneNumber = scanner.nextLine();
        } else if (scanner.nextLine().equals("No!")) {
            System.out.println("But you have no choice!");
            createBankAccount(createCustomer());
        } else {
            System.out.println("Invalid input!");
            createBankAccount(createCustomer());
        }
        Customer newCustomer = new Customer(name , address, phoneNumber);
        customer = newCustomer;
        System.out.println("Your customer data is " + newCustomer);
        return newCustomer;
    }

    //The main menu of the bank automate, used for navigation between accounts and for creating new accounts
    public void menu() {
        System.out.println("\n What do you want to do?");
        System.out.println("""
                1. Create a new bank account
                2. Switch account
                3. Cancel
                """);
        if (scanner.nextLine().equals("1")) {
            createBankAccount(customer);
        } else if (scanner.nextLine().equals("2")) {
            System.out.println(customer.showAccs());
            System.out.println("Type in the accounts number you want to edit");
            currentAcc = customer.getAccount(scanner.nextInt());
            System.out.println("You switched your account to: " + currentAcc);
            editCurrentAccount();
        } else if (scanner.nextLine().equals("3")) {
            System.out.println("The End!");
            System.exit(0);
        } else {
            System.out.println("No valid input!");
            menu();
        }

    }

    //Creating a bank account and choosing which type the bank account should be of
    public void createBankAccount(Customer newCustomer) {
        System.out.println("Do you want to create an bank account? Type: Yes! or No!");
        if (scanner.nextLine().equals("Yes!")) {
            System.out.println("Which type of account do you want to create?");
            System.out.println("""
                    1. Giro account
                    2. Daily money account
                    3. Static money account
                                    
                    If you need help with the account types type: Help!
                    """);
            System.out.println("Type now: ");
            Account account = null;
            if (scanner.nextLine().equals("Help!")) {
                System.out.println("""
                        1. Giro account:
                           The Giro account has the advantage that you get a GiroCard with creating the account, you can take a credit and get bonus payment.
                        2. Daily money account
                           The daily money account has the advantage that you get interest for every deposit.
                        3. Static money account
                           The static money account has the advantage that you get interest for a set amount of time.
                           """);
                createBankAccount(newCustomer);
            } else if (scanner.nextLine().equals("1")) {
                account = createGiroAccount();
            } else if (scanner.nextLine().equals("2")) {
                account = createDailyMoneyAccount();
            } else if (scanner.nextLine().equals("3")) {
                account = createStaticMoneyAccount();
            } else {
                System.out.println("Invalid input!");
                createBankAccount(newCustomer);
            }
            newCustomer.setAccount(account);
            currentAcc = account;
            assert account != null;
            System.out.println(newCustomer.getAccount(account.getAccNumber()));
            menu();
        } else if (scanner.nextLine().equals("No!")) {
            System.out.println("But you have no choice!");
            createBankAccount(newCustomer);
        } else {
            System.out.println("No valid input!");
            createBankAccount(newCustomer);
        }
    }

    //Create Giro account
    public GiroAccount createGiroAccount() {
        return new GiroAccount(1 + (int) (Math.random() * 999999999), 0.0, 100, "YourGiroCard", 10);
    }

    //Create Daily money account
    public DailyMoneyAccount createDailyMoneyAccount() {
        return new DailyMoneyAccount(1 + (int) (Math.random() * 999999999), 0.0, 12);
    }

    //Create Static money account
    public StaticMoneyAccount createStaticMoneyAccount() {
        return new StaticMoneyAccount(1 + (int) (Math.random() * 999999999), 0.0, 12.0, 0);
    }

    //Choosing which account type the current is and navigating to specific account menu
    private void editCurrentAccount() {
        if (currentAcc instanceof GiroAccount) {
            giroAccountMenu((GiroAccount) currentAcc);
        } else if (currentAcc instanceof StaticMoneyAccount) {
            staticMoneyAccountMenu((StaticMoneyAccount) currentAcc);
        } else if (currentAcc instanceof DailyMoneyAccount) {
            dailyMoneyAccountMenu((DailyMoneyAccount) currentAcc);
        } else {
            System.out.println("Error");
        }
    }

    //Menu specifically for the Daily money account
    private void dailyMoneyAccountMenu(DailyMoneyAccount dailyMoneyAccount) {
        System.out.println("""
                1. Deposit
                2. Withdraw
                3. Show Account Data
                4. Get your Interest
                5. Back to main menu
                   """);

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("You chose to deposit");
                System.out.println("Put in the amount of money you wish to deposit");
                dailyMoneyAccount.deposit(scanner.nextDouble());
                dailyMoneyAccountMenu(dailyMoneyAccount);
            case 2:
                System.out.println("You chose to withdraw");
                System.out.println("Put in the amount of money you wish to withdraw");
                dailyMoneyAccount.withdraw(scanner.nextDouble());
                dailyMoneyAccountMenu(dailyMoneyAccount);
            case 3:
                System.out.println("You chose to show your account data");
                System.out.println(dailyMoneyAccount.toString());
                dailyMoneyAccountMenu(dailyMoneyAccount);
            case 4:
                System.out.println("You chose to get your interest");
                System.out.println(dailyMoneyAccount.getInterest());
                dailyMoneyAccountMenu(dailyMoneyAccount);
            case 5:
                System.out.println("Back to main menu...");
                menu();
            default:
                System.out.println("Wrong input");
                dailyMoneyAccountMenu(dailyMoneyAccount);
        }
    }

    //Menu specifically for the Static money account
    private void staticMoneyAccountMenu(StaticMoneyAccount staticMoneyAccount) {
        System.out.println("""
                1. Deposit
                2. Withdraw
                3. Show Account Data
                4. Get your Interest
                5. Add runtime for interest
                6. Back to main menu
                   """);

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("You chose to deposit");
                System.out.println("Put in the amount of money you wish to deposit");
                staticMoneyAccount.deposit(scanner.nextDouble());
                staticMoneyAccountMenu(staticMoneyAccount);
            case 2:
                System.out.println("You chose to withdraw");
                System.out.println("Put in the amount of money you wish to withdraw");
                staticMoneyAccount.withdraw(scanner.nextDouble());
                staticMoneyAccountMenu(staticMoneyAccount);
            case 3:
                System.out.println("You chose to show your account data");
                System.out.println(staticMoneyAccount.toString());
                staticMoneyAccountMenu(staticMoneyAccount);
            case 4:
                System.out.println("You chose to get your interest");
                staticMoneyAccount.addInterest();
                staticMoneyAccountMenu(staticMoneyAccount);
            case 5:
                System.out.println("You chose to add your runtime");
                System.out.println("Put in the number of years the runtime should be:");
                staticMoneyAccount.setRuntime(scanner.nextInt());
                staticMoneyAccountMenu(staticMoneyAccount);
            case 6:
                System.out.println("Back to main menu...");
                menu();
            default:
                System.out.println("Wrong input");
                staticMoneyAccountMenu(staticMoneyAccount);
        }
    }

    //Menu specifically for the Giro account
    private void giroAccountMenu(GiroAccount giroAccount) {
        System.out.println("""
                1. Deposit (with bonus included)
                2. Withdraw
                3. Show Account Data
                4. Get giro Card
                5. Set credit frame
                6. Get credit
                7. Set bonus payment
                8. Back to main menu
                   """);

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("You chose to deposit");
                System.out.println("Put in the amount of money you wish to deposit");
                giroAccount.deposit(scanner.nextDouble());
                giroAccountMenu(giroAccount);
            case 2:
                System.out.println("You chose to withdraw");
                System.out.println("Put in the amount of money you wish to withdraw");
                giroAccount.withdraw(scanner.nextDouble());
                giroAccountMenu(giroAccount);
            case 3:
                System.out.println("You chose to show your account data");
                System.out.println(giroAccount.toString());
                giroAccountMenu(giroAccount);
            case 4:
                System.out.println("You demanded your giro card");
                System.out.println(giroAccount.getGiroCard());
                giroAccountMenu(giroAccount);
            case 5:
                System.out.println("You chose to set your credit frame");
                System.out.println("Input the new credit frame max");
                giroAccount.setCreditFrame(scanner.nextDouble());
                giroAccountMenu(giroAccount);
            case 6:
                System.out.println("You chose to get a credit");
                giroAccount.getCredit(scanner.nextInt());
                giroAccountMenu(giroAccount);
            case 7:
                System.out.println("You chose to set your bonus payment");
                System.out.println("Put in the bonus payment percentage");
                giroAccount.setBonusPayment(scanner.nextInt());
                giroAccountMenu(giroAccount);
            case 8:
                System.out.println("Back to main menu...");
                menu();
            default:
                System.out.println("Wrong input");
                giroAccountMenu(giroAccount);
        }
    }
}