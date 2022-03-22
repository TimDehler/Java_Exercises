package de.tim.wochenlohn;
import java.util.Scanner;

public class Wochenlohn {

    private Scanner in;
    public Wochenlohn(){
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Wochenlohn wochenlohn = new Wochenlohn();
        wochenlohn.calculate();
    }
    public void calculate(){
        System.out.print("Geben sie den Stundenlohn ein: ");
        int stundenlohn = in.nextInt();
        System.out.print("Geben sie die Arbeitsstunden ein: ");
        int arbeitsstunden = in.nextInt();
        System.out.print("Geben sie den Überstunden ein: ");
        int ueberstunden = in.nextInt();

        int gesamtlohn = (arbeitsstunden*stundenlohn)+(ueberstunden*(stundenlohn*120/100));

        System.out.println("Ihr Gehalt beträgt: "+gesamtlohn);
    }
}
