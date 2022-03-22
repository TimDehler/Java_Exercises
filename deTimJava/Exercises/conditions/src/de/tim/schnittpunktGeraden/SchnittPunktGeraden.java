package de.tim.schnittpunktGeraden;

import java.util.Scanner;

public class SchnittPunktGeraden {

    private Scanner in;

    public SchnittPunktGeraden() {
        in = new Scanner(System.in);
    }

    double a, b, c, d, x, y;

    public static void main(String[] args) {
        SchnittPunktGeraden schnittPunktGeraden = new SchnittPunktGeraden();
        schnittPunktGeraden.eingabe();
        schnittPunktGeraden.testen();

    }

    public void eingabe() {
        System.out.print("Geben sie die Länge a an: ");
        a = in.nextDouble();
        System.out.print("Geben sie die Länge b an: ");
        b = in.nextDouble();
        System.out.print("Geben sie die Länge c an: ");
        c = in.nextDouble();
        System.out.print("Geben sie die Länge d an: ");
        d = in.nextDouble();
    }

    public void testen() {
        if (a == c) {
            if (b == d) {
                System.out.println("Es gibt unendlich Schnittpunkte");
            } else {
                System.out.println("Die Geraden liegen Parallel");
            }
        } else {
            System.out.println("Die Geraden schneiden sich im Punkt: ");
            berechnen();
        }
    }

    public void berechnen() {
        double g = a - c;
        double f = d - b;
        x = f / g;
        y = a * x + b;
        System.out.print("(" + x + "/" + y + ")");
    }
}
