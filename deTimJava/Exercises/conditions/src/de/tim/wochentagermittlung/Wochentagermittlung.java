package de.tim.wochentagermittlung;

import java.util.Scanner;

public class Wochentagermittlung {

    private Scanner in;

    public Wochentagermittlung() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Wochentagermittlung wochentagermittlung = new Wochentagermittlung();
        //wochentagermittlung.ermitteln();
        wochentagermittlung.switchermitteln();
    }

    public void ermitteln() {
        System.out.print("Geben sie die Zahl des zu ermittelnden Tages ein: ");
        double tag = in.nextDouble();
        if (tag < 1 || tag > 7) {
            System.out.println("ungültige Eingabe");
            return;
        }
        if (tag == 6 || tag == 7) {
            System.out.print("Es ist Wochenende und der Tag ist: ");
        } else {
            System.out.print("Es ist unter der Woche und der Tag ist: ");
        }
        if (tag == 1) {
            System.out.println("Montag");
        } else if (tag == 2) {
            System.out.println("Dienstag");
        } else if (tag == 3) {
            System.out.println("Mittwoch");
        } else if (tag == 4) {
            System.out.println("Donnerstag");
        } else if (tag == 5) {
            System.out.println("Freitag");
        } else if (tag == 6) {
            System.out.println("Samstag");
        } else if (tag == 7) {
            System.out.println("Sonntag");
        }
    }

    public void switchermitteln() {
        System.out.print("Geben sie die Zahl des zu ermittelnden Tages ein: ");
        int tag = in.nextInt();
        if (tag == 6 || tag == 7) {
            System.out.print("Es ist Wochenende und es ist: ");
        }
        switch (tag) {
            case 1 -> System.out.println("Montag");
            case 2 -> System.out.println("Dienstag");
            case 3 -> System.out.println("Mittwoch");
            case 4 -> System.out.println("Donnerstag");
            case 5 -> System.out.println("Freitag");
            case 6 -> System.out.println("Samstag");
            case 7 -> System.out.println("Sonntag");
            default -> System.out.println("Der Tag existiert nicht!");
        }
    }
}
