package de.tim.kegelberechnung;
import java.util.Scanner;

public class Kegelberechnung {

    private Scanner in;

    public Kegelberechnung() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Kegelberechnung kegelberechnung = new Kegelberechnung();
        kegelberechnung.calculate();
    }

    public void calculate() {
        System.out.print("Geben sie den Radius r ein: ");
        double radius = in.nextDouble();
        System.out.print("Geben sie die Höhe h ein: ");
        double hoehe = in.nextDouble();

        double seitenlinie = Math.sqrt(hoehe * hoehe + radius * radius);
        double oberflaeche = Math.PI * radius * (radius + seitenlinie);
        double volumen = Math.PI / 3 * radius * radius * hoehe;

        System.out.println("Die Länge der Seitenlinie beträgt: " + seitenlinie);
        System.out.println("Die Oberflaeche beträgt: " + oberflaeche);
        System.out.println("Das Volumen beträgt: " + volumen);
    }
}