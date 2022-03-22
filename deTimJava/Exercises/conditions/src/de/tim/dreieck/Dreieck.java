package de.tim.dreieck;

import java.util.Scanner;

public class Dreieck {

    private Scanner in;
    private double a;
    private double b;
    private double c;

    public Dreieck() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Dreieck dreieck = new Dreieck();
        dreieck.eingabe();
        if (dreieck.pruefen()) {
            dreieck.gleichseitig();
            //dreieck.rechtwinklig();
            dreieck.rechtwinklig2();
        }
    }

    public void eingabe() {
        System.out.print("Geben sie die Seitenlänge a an:");
        a = in.nextDouble();
        System.out.print("Geben sie die Seitenlänge b an:");
        b = in.nextDouble();
        System.out.print("Geben sie die Seitenlänge c an:");
        c = in.nextDouble();
    }

    public boolean pruefen() {

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Die Seiten ergeben zusammen ein Dreieck!");
            return true;
        } else {
            System.out.println("Die Seiten ergeben zusammen kein Dreieck!");
            return false;
        }
    }

    public void gleichseitig() {
        if (a == b || a == c || b == c) {
            System.out.println("Das Dreieck ist gleichschenklig!");
        } else {
            System.out.println("Das Dreieck ist nicht gleichschenklig!");
        }
    }

    /*
    public void rechtwinklig(){
        if (a*a+b*b==c*c){
            System.out.println("Das Dreieck ist rechtwinklig!");
        }else if(c*c+a*a==b*b){
            System.out.println("Das Dreieck ist rechtwinklig!");
        }else if(b*b+c*c==a*a){
            System.out.println("Das Dreieck ist rechtwinklig!");
        }else{
            System.out.println("Das Dreieck ist nicht rechtwinklig!");
        }
    }

     */
    public void rechtwinklig2() {
        if (a * a + b * b == c * c||c * c + a * a == b * b||b * b + c * c == a * a) {
            System.out.println("Das Dreieck ist rechtwinklig!");
        } else {
            System.out.println("Das Dreieck ist nicht rechtwinklig!");
        }
    }
}
