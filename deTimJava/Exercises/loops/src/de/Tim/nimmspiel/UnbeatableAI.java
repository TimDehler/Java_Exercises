package de.Tim.nimmspiel;

import java.util.Random;
import java.util.Scanner;

public class UnbeatableAI {

    private Scanner in;

    public UnbeatableAI() {
        in = new Scanner(System.in);
    }

    int recievePlayer;
    int i;
    int inputPlayer;
    int aiTake;

    public static void main(String[] args) {
        UnbeatableAI unbeatableAI = new UnbeatableAI();
        unbeatableAI.startGame();
    }

    public void startGame() {

        recievePlayer = 1 + (int) (Math.random() * 2);

        System.out.println("The Game is starting!");

        for (i = 13; i > 0; ) {
            System.out.println("There are " + i + " sticks left!");
            if (recievePlayer == 1) {
                System.out.println("It is the players turn!");
                System.out.print("Put in a number from 1 to 3: ");
                inputPlayer = in.nextInt();
                if (inputPlayer < 0 || inputPlayer > 3) {
                    System.out.println("No valid input!");
                    break;
                }
                i -= inputPlayer;
                recievePlayer = 2;
            }
            if (recievePlayer == 2 && i > 0) {

                if ((i - 3) % 4 == 0) {
                    aiTake = 3;
                } else if ((i - 2) % 4 == 0) {
                    aiTake = 2;
                } else if ((i - 1) % 4 == 0) {
                    aiTake = 1;
                }else{
                    aiTake = (new Random().nextInt(3) + 1);
                }
                i -= aiTake;
                System.out.println("The computer took " + aiTake + " sticks");
                recievePlayer = 1;
            } else {
                System.out.println("ERROR");
                break;
            }
        }
        System.out.println("The AI won the game!");
    }
}

