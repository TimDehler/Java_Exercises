package de.tim.qugleichung;

import java.util.Scanner;

public class QuadratischeGleichungen {

    private Scanner in;
    private double a, b, c;

    public QuadratischeGleichungen() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        QuadratischeGleichungen quadratischeGleichungen = new QuadratischeGleichungen();
        quadratischeGleichungen.eingabe();
        quadratischeGleichungen.lösen();

    }

    public void eingabe() {
        System.out.print("Geben sie den Wert für a an:");
        a = in.nextDouble();
        System.out.print("Geben sie den Wert für b an:");
        b = in.nextDouble();
        System.out.print("Geben sie den Wert für c an:");
        c = in.nextDouble();
    }

    public void lösen() {
        double x1, x2;
        if (a != 0) {
            double p = b/a;
            double q = c/a;
            double wurzel = (p / 2) * (p / 2) - q;
            if (wurzel == 0) {
                x1 = -p / 2;
                System.out.println("Es gibt nur eine Lösung: " + x1);
            } else if (wurzel < 0) {
                System.out.println("Es gibt keine Lösung!");
            } else {
                x1 = -p / 2 + Math.sqrt(wurzel);
                x2 = -p / 2 - Math.sqrt(wurzel);
                System.out.println("X1 = " + x1 + "X2 = " + x2);
            }
        } else {
            System.out.println("a darf nicht null sein!");
        }
    }
}
