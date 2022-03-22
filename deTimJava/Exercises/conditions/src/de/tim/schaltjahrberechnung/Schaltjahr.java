package de.tim.schaltjahrberechnung;

import java.util.Scanner;

public class Schaltjahr {

    private Scanner in;

    public Schaltjahr() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Schaltjahr schaltjahr = new Schaltjahr();
        schaltjahr.ermitteln();
    }

    public void ermitteln() {
        System.out.print("Geben sie das Jahr ein: ");
        int jahr = in.nextInt();
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0 && !(jahr % 400 == 0)) {
                System.out.println("Es ist kein Schaltjahr!");
            } else if (jahr % 400 == 0 && jahr % 100 == 0) {
                System.out.println("Es ist ein Schaltjahr!");
            } else if (!(jahr % 100 == 0)) {
                System.out.println("Es ist ein Schaltjahr!");
            }
        } else {
            System.out.println("Es ist kein Schaltjahr!");
        }
    }
}
