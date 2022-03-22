package de.tim.kreisring;
import java.util.Scanner;

public class Kreisring {

    private Scanner in;
    public Kreisring(){
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Kreisring kreisring = new Kreisring();
        kreisring.calculate();
    }
    public void calculate() {
        System.out.print("Geben sie den Innenradius ein: ");
        double innenradius = in.nextDouble();
        System.out.print("Geben sie den Aussenradius ein: ");
        double aussenradius = in.nextDouble();

        double flaecheninhalt = Math.PI * (aussenradius * aussenradius - innenradius * innenradius);

        System.out.println("Der Flächeninhalt beträgt: " + flaecheninhalt);
    }
}

