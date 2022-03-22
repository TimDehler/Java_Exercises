package de.tim;

import de.tim.bmi.BMI;
import de.tim.dreieck.Dreieck;
import de.tim.ikauf.IKauf;
import de.tim.notenzuweisung.Notenzuweisung;
import de.tim.qugleichung.QuadratischeGleichungen;
import de.tim.schaltjahrberechnung.Schaltjahr;
import de.tim.schnittpunktGeraden.SchnittPunktGeraden;
import de.tim.versandgeschaeft.Versandgeschäft;
import de.tim.wochentagermittlung.Wochentagermittlung;

import java.util.Scanner;

public class Start {

    private Scanner in;

    public Start() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Start main = new Start();
        main.starten();

    }

    public void starten() {
        System.out.print("Geben sie die abzuspielende Aufgabe ein: ");
        int aufgabennummer = in.nextInt();
        switch (aufgabennummer) {
            case 1 -> ikauf();
            case 2 -> dreieck();
            case 3 -> quadratischeGleichung();
            case 4 -> schaltjahr();
            case 5 -> versandgeschaeft();
            case 6 -> bmi();
            case 7 -> schnittpunktGeraden();
            case 8 -> notenzuweisung();
            case 9 -> wochentagermittlung();
            default -> System.out.println("Gültige Aufgabennummer eingeben!");
        }
    }

    public void ikauf() {
        System.out.println("Es folgt die 1. Aufgabe iKauf!");
        IKauf iKauf = new IKauf();
        iKauf.calculate();
    }

    public void dreieck() {
        System.out.println("Es folgt die 2. Aufgabe Dreieck!");
        Dreieck dreieck = new Dreieck();
        dreieck.eingabe();
        dreieck.pruefen();
        dreieck.gleichseitig();
        dreieck.rechtwinklig2();
    }

    public void quadratischeGleichung() {
        System.out.println("Es folgt die 3. Aufgabe Quadratische Gleichung!");
        QuadratischeGleichungen quadratischeGleichungen = new QuadratischeGleichungen();
        quadratischeGleichungen.eingabe();
        quadratischeGleichungen.lösen();
    }

    public void schaltjahr() {
        System.out.println("Es folgt die 4. Aufgabe Schaltjahrberechnung!");
        Schaltjahr schaltjahr = new Schaltjahr();
        schaltjahr.ermitteln();
    }

    public void versandgeschaeft() {
        System.out.println("Es folgt die 5. Aufgabe Versandgeschäft!");
        Versandgeschäft versandgeschäft = new Versandgeschäft();
        versandgeschäft.preisberechnung();

    }

    public void bmi() {
        System.out.println("Es folgt die 6. Aufgabe BMI");
        BMI bmi = new BMI();
        bmi.eingabe();
        bmi.berechnung();
    }

    public void schnittpunktGeraden() {
        System.out.println("Es folgt die 7. Aufgabe Schnittpunktgeraden!");
        SchnittPunktGeraden schnittPunktGeraden = new SchnittPunktGeraden();
        schnittPunktGeraden.eingabe();
        schnittPunktGeraden.testen();
        schnittPunktGeraden.berechnen();
    }

    public void notenzuweisung() {
        System.out.println("Es folgt die 8. Aufgabe Notenzuweisung!");
        Notenzuweisung notenzuweisung = new Notenzuweisung();
        notenzuweisung.abfrage();
    }

    public void wochentagermittlung() {
        System.out.println("Es folgt die 9. Aufgabe Wochentagermittlung!");
        Wochentagermittlung wochentagermittlung = new Wochentagermittlung();
        wochentagermittlung.ermitteln();
    }
}
