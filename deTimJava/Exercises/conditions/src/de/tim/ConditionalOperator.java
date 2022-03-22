package de.tim;

import java.util.Scanner;

public class ConditionalOperator {

    Scanner scanner = new Scanner(System.in);

    public ConditionalOperator() {
    }

    public static void main(String[] args) {
        ConditionalOperator start = new ConditionalOperator();
        start.testTen();
        start.positiveORNegative();
        start.higherValue();
        start.absoluteValue();

    }

    public void testTen() {
        System.out.print("Put in number: ");
        int x = scanner.nextInt();

        if (x < 10) {
            System.out.println("Number is less than 10!");
        } else if (x == 10) {
            System.out.println("Number is euqal to 10!");
        } else {
            System.out.println("Number is higher than 10!");
        }
    }

    public void positiveORNegative() {
        System.out.print("Put in a number: ");
        if (scanner.nextLine().contains("-")) {
            System.out.println("The number is negative");
        } else if (scanner.nextLine().equals("0")) {
            System.out.println("The number is 0");
        } else {
            System.out.println("The number is positive");
        }
    }

    public void higherValue() {
        System.out.println("Put in number 1");
        int number1 = scanner.nextInt();
        System.out.println("Put in number 2");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number2 + " is greater than " + number1);
        } else {
            System.out.println(number1 + " is the same as " + number2);
        }
    }

    public void absoluteValue() {
        System.out.println("Put in the number");
        int x = scanner.nextInt();
        System.out.println(Math.abs(x));
    }
}
