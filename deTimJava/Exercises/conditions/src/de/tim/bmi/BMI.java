package de.tim.bmi;

import java.util.Scanner;

public class BMI {

    private String geschlecht;
    private double alter;
    private double gewicht;
    private double groesse;

    private Scanner in;

    public BMI() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.eingabe();
        bmi.berechnung();
    }

    public void eingabe() {
        System.out.print("Geben sie ihr Geschlecht an! ");
        geschlecht = in.next();
        System.out.print("Geben sie ihr Alter an! ");
        alter = in.nextDouble();
        if (alter < 18) {
            System.out.println("Sie sind nicht zugelassen!");
            return;
        }
        System.out.print("Geben sie ihr Gewicht an! ");
        gewicht = in.nextDouble();
        System.out.print("Geben sie ihre Größe in Centimetern an! ");
        groesse = in.nextDouble();
        if (groesse < 1.2) {
            System.out.println("Sie sind nicht zugelassen!");
            return;
        }
    }

    public void berechnung() {

        double toleranzobergrenze;
        double toleranzuntergrenze;

        if (alter > 17 && groesse >= 1.2) {
            if (geschlecht == "m") {
                toleranzobergrenze = groesse * 115 / 100 - 100;
                toleranzuntergrenze = groesse * 95 / 100 - 100;
            } else {
                toleranzobergrenze = groesse * 104 / 100 - 100;
                toleranzuntergrenze = groesse * 93 / 100 - 100;
            }
            if (gewicht >= toleranzuntergrenze && gewicht <= toleranzobergrenze) {
                System.out.println("Sie sind im Normalbereich!");
            } else if (gewicht < toleranzuntergrenze) {
                System.out.println("Sie sind untergewichtig!");
            } else {
                System.out.println("Sie sind übergewichtig!");
            }
        }
    }
}
