package de.tim.maklerfirma;
import java.util.Scanner;

public class Maklerfirma {

    private Scanner in;
    public Maklerfirma(){
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Maklerfirma maklerfirma = new Maklerfirma();
        maklerfirma.calculate();
    }
    public void calculate(){
        System.out.print("Geben sie die Länge des Grundstücks ein: ");
        double laenge = in.nextDouble();
        System.out.print("Geben sie die Breite des Grundstücks ein: ");
        double breite = in.nextDouble();
        System.out.print("Geben sie den Quadratmeterpreis ein: ");
        double quadratmeterpreis = in.nextDouble();

        double flaeche = laenge*breite;
        double grundstueckspreis = flaeche*quadratmeterpreis;
        double maklergebuehr = grundstueckspreis*3/100;
        double gesamtbetrag;

        gesamtbetrag = (grundstueckspreis+maklergebuehr)*119/100;
        System.out.println("Der Gesamtbetrag von "+gesamtbetrag+" beinhaltet die Maklergebühr von "+maklergebuehr+", sowie den Grundstückspreis von "+grundstueckspreis+" und die Mehrwertsteuer." );
    }
}
