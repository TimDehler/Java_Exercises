import de.tim.kegelberechnung.Kegelberechnung;
import de.tim.kreisring.Kreisring;
import de.tim.maklerfirma.Maklerfirma;
import de.tim.quarderberechnung.Quarderberechnung;
import de.tim.weinhaendler.Weinhaendler;
import de.tim.wochenlohn.Wochenlohn;

public class Start {

    public static void main(String[] args) {
        System.out.println("Es folgt die 1. Aufgabe Quarderberechnung!");
        Quarderberechnung quarderberechnung = new Quarderberechnung();
        quarderberechnung.calculate();

        System.out.println("Es folgt die 2. Aufgabe Wochenlohn!");
        Wochenlohn wochenlohn = new Wochenlohn();
        wochenlohn.calculate();

        System.out.println("Es folgt die 3. Aufgabe Kreisring!");
        Kreisring kreisring = new Kreisring();
        kreisring.calculate();

        System.out.println("Es folgt die 4. Aufgabe Kegelberechnung!");
        Kegelberechnung kegelberechnung = new Kegelberechnung();
        kegelberechnung.calculate();

        System.out.println("Es folgt die 5. Aufgabe Maklerfirma!");
        Maklerfirma maklerfirma = new Maklerfirma();
        maklerfirma.calculate();

        System.out.println("Es folgt die 6. Aufgabe Weinhaendler!");
        Weinhaendler weinhaendler = new Weinhaendler();
        weinhaendler.calculate();

    }
}
