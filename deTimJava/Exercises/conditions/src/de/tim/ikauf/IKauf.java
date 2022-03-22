package de.tim.ikauf;
import java.util.Scanner;

public class IKauf {

    private Scanner in;
    public IKauf(){
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        IKauf ikauf = new IKauf();
        ikauf.calculate();
    }
    public void calculate(){
        System.out.print("Geben Sie den Auftragswert ein: ");
        double auftragswert = in.nextDouble();
        double rechnungsendbetrag;

        if (auftragswert<100){
            rechnungsendbetrag = auftragswert+3.50;
        }else {
            rechnungsendbetrag = auftragswert*98/100;
        }
        System.out.println("Der zu zahlende Betrag ist: "+rechnungsendbetrag+"€");
    }
}
