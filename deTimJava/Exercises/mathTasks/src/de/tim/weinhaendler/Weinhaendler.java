package de.tim.weinhaendler;
import java.util.Scanner;

public class Weinhaendler {

    private Scanner in;
    public Weinhaendler(){
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Weinhaendler weinhaendler = new Weinhaendler();
        weinhaendler.calculate();
    }
    public void calculate(){
        System.out.print("Geben sie die zu bezahlende Flaschenanzahl ein: ");
        int flaschenanzahl = in.nextInt();
        double flaschenpreis = 5.00;
        double endbetrag;

        if (flaschenanzahl>=100){
            endbetrag = flaschenanzahl*4.50;
        } else{
            endbetrag = flaschenanzahl * flaschenpreis;
        }
        System.out.println("Der zu zahlende Endbetrag ist: "+endbetrag+"€");
    }
}
