package de.tim.versandgeschaeft;

import java.util.Scanner;

public class Versandgeschäft {


    private Scanner in;

    public Versandgeschäft() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Versandgeschäft versandgeschäft = new Versandgeschäft();
        versandgeschäft.preisberechnung();
    }

    public void preisberechnung() {
        System.out.print("Geben sie den Auftragswert ein!");
        double auftragswert = in.nextDouble();

        if (auftragswert <= 100) {
            auftragswert = auftragswert + 3 + 2;
            System.out.println("Der finale Preis beträgt: " + auftragswert);
        } else if (auftragswert > 100 && auftragswert <= 200) {
            auftragswert = auftragswert + 2;
            System.out.println("Der finale Preis beträgt: " + auftragswert);
        } else {
            System.out.println("Der finale Preis beträgt: " + auftragswert);
        }
    }
}