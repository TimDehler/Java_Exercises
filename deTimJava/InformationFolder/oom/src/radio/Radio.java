package radio;

import java.util.Scanner;

public class Radio {

    private boolean onOf;
    private int volume;
    private double frequency;

    public Radio() {
    }

    public Radio(boolean onOf, int volume, double frequency) {
        this.onOf = onOf;
        if (volume > 10) {
            System.out.println("You cant go this loud!");
            this.volume = 10;
        } else if (volume < 0) {
            System.out.println("The radio is already silent!");
        } else {
            this.volume = volume;
        }
        if (frequency < 85.0 || frequency > 110.0) {
            System.out.println("You only hear rustle");
            chFrequency();
        } else {
            this.frequency = frequency;
        }
    }

    public void powerSwitch() {
        if (!onOf) {
            System.out.println("Turning the radio on...");
            onOf = true;
        } else {
            System.out.println("Turning the radio of...");
            onOf = false;
        }
    }

    public void louder() {
        if (onOf) {
            if (volume < 10) {
                System.out.println("The music is playing louder!");
                volume++;
            } else {
                System.out.println("ITS MAX VOLUME!!!");
            }
        }
    }

    public void fade() {
        if (onOf) {
            if (volume > 0) {
                System.out.println("The music is fading...");
                volume--;
            } else {
                System.out.println("Silence occurs...");
            }
        }
    }

    public void chFrequency(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put in the desired frequency: ");
        frequency = scanner.nextDouble();
        if(frequency > 110.0 || frequency < 85.0){
            frequency = 99.9;
        }
        System.out.println("The frequency is: "+frequency);
    }

    @Override
    public String toString() {
        if (onOf) {
            return "Radio on: Frequency " + frequency + ", Volume: " + volume;
        }else {
            return "Radio: off";
        }
    }
}
