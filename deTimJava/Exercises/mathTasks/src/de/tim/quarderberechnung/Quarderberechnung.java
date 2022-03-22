package de.tim.quarderberechnung;
import java.util.Scanner;

public class Quarderberechnung {

    private Scanner in;
    public Quarderberechnung(){
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Quarderberechnung quarderberechnung = new Quarderberechnung();
        quarderberechnung.calculate();
    }
    public void calculate(){
        System.out.print("Kantenlaenge1 eingeben: ");
        int kantenlaenge1 = in.nextInt();
        System.out.print("Kantenlaenge2 eingeben: ");
        int kantenlaenge2 = in.nextInt();
        System.out.print("Kantenlaenge3 eingeben: ");
        int kantenlaenge3 = in.nextInt();

        int oberflaeche = 2*(kantenlaenge1*kantenlaenge2+kantenlaenge1*kantenlaenge3+kantenlaenge2*kantenlaenge3);
        int volumen = kantenlaenge1*kantenlaenge2*kantenlaenge3;

        System.out.println("Die Oberflaeche ist: "+oberflaeche);
        System.out.println("Das Volumen betraegt: "+volumen);

    }
}
