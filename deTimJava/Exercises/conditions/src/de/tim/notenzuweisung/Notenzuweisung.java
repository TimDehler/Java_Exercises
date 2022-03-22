package de.tim.notenzuweisung;

import java.util.Scanner;

public class Notenzuweisung {

    private Scanner in;

    public Notenzuweisung() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Notenzuweisung notenzuweisung = new Notenzuweisung();
        //notenzuweisung.abfrage();
        notenzuweisung.switchabfrage();
    }

    public void abfrage() {
        System.out.print("Geben sie die erreichte Note ein! ");
        int note = in.nextInt();
        if (note < 1 || note > 6) {
            System.out.println("Deine Note muss zwischen 1 und 6 liegen!");
        } else {
            if (note == 1) {
                System.out.println("Ihre Note ist sehr gut!");
            } else if (note == 2) {
                System.out.println("Ihre Note ist gut!");
            } else if (note == 3) {
                System.out.println("Ihre Note ist befriedigend!");
            } else if (note == 4) {
                System.out.println("Ihre Note ist ausreichend!");
            } else if (note == 5) {
                System.out.println("Ihre Note ist mangelhaft!");
            } else {
                System.out.println("Ihre Note ist ungenügend!");
            }
        }
    }

    public void switchabfrage() {
        System.out.print("Geben sie die erreichte Note ein: ");
        int note = in.nextInt();
        switch (note) {
            case 1 -> System.out.println("Ihre Note ist sehr gut!");
            case 2 -> System.out.println("Ihre Note ist gut!");
            case 3 -> System.out.println("Ihre Note ist befriedigend!");
            case 4 -> System.out.println("Ihre Note ist ausreichend!");
            case 5 -> System.out.println("Ihre Note ist mangelhaft!");
            case 6 -> System.out.println("Ihre Note ist ungenügend!");
            default -> System.out.println("Deine Note muss zwischen 1 und 6 liegen!");
        }
    }
}
