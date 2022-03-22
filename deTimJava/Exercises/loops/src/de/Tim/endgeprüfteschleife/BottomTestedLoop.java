package de.Tim.endgeprüfteschleife;

import java.util.Scanner;

public class BottomTestedLoop {

    private Scanner in;

    public BottomTestedLoop() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        BottomTestedLoop bottomTestedLoop = new BottomTestedLoop();
        bottomTestedLoop.play();
    }

    public void play() {
        System.out.print("Geben sie die Aufgabennummer ein: ");
        int input = in.nextInt();
        switch (input) {
            case 1 -> countToTen();
            case 2 -> alternateCountToTen();
            case 3 -> countToHundred();
            case 4 -> alternateCountToHundred();
            case 5 -> alwaysOneMore();
            default -> System.out.println("Gültige Nummer eingeben!");
        }
    }

    public void countToTen() {
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);
        System.out.println("Fertig!");
    }

    public void alternateCountToTen() {
        int counter1 = -10;

        do {
            System.out.println(counter1);
            counter1 += 2;
        } while (counter1 <= 10);
        System.out.println("Fertig!");
    }

    public void countToHundred() {
        int counter2 = 0;
        int plus = 1;
        do {
            System.out.println(counter2);
            counter2 += plus;
            plus += 2;
        } while (counter2 <= 100);
        System.out.println("Fertig");
    }

    public void alternateCountToHundred() {
        int counter3 = 1;
        do {
            System.out.println(counter3);
            counter3 *= 2;
        } while (counter3 < 100);
        System.out.println("Fertig");
    }

    public void alwaysOneMore() {
        int counter4 = 0;
        int plus1 = 1;
        do {
            System.out.println(counter4);
            counter4 += plus1;
            plus1++;
        } while (counter4 < 100);
        System.out.println("Fertig");
    }
}
