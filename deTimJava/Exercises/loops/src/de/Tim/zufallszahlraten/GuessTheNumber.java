package de.Tim.zufallszahlraten;

import java.util.Random;
import java.util.Scanner;

public class
GuessTheNumber {

    private Scanner in;

    public GuessTheNumber() {
        in = new Scanner(System.in);
    }

    int inputnumber;

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.play();
    }

    public void play() {

        Random randomNumber = new Random();
        int number = randomNumber.nextInt(100);

        do {

            System.out.println("Geben sie eine Zahl zwischen 1 und 100 ein!");
            inputnumber = in.nextInt();
            if (inputnumber > number) {
                System.out.println("Deine Zahl ist zu hoch!");
            } else if (inputnumber < number) {
                System.out.println("Deine Zahl ist zu niedrig!");
            }

        } while (inputnumber != number);
            System.out.println("Sie haben die Zahl erraten die Zahl ist: " + inputnumber);
    }
}
