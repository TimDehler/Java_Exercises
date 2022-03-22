package de.Tim.nimmspiel;

import java.util.Scanner;

public class AgainstAI {

    private Scanner in;

    public AgainstAI() {
        in = new Scanner(System.in);
    }

    int recievePlayer;
    int i;
    int inputPlayer;
    int randomAi;

    public static void main(String[] args) {
        AgainstAI againstAI = new AgainstAI();
        againstAI.startgame();
        //againstAI.test();
    }

    public void startgame() {

        recievePlayer = 1 + (int) (Math.random() * 2);
        System.out.println(recievePlayer);


        System.out.println("The Game is starting!");

        for (i = 13; i > 0; ) {
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

            } else if (recievePlayer == 2) {
                System.out.println("It is the AI's turn!");
                randomAi = 1 + (int) (Math.random() * 3);
                System.out.println("The AI took " + randomAi + " sticks!");
                i -= randomAi;
                recievePlayer = 1;
            } else {
                System.out.println("ERROR");
                break;
            }
            System.out.println("There are " + i + " sticks left!");
            if (i == 2) {
                System.out.println("The AI won the game!");
            } else {
                System.out.println("The player won the game!");
            }
        }
    }

    public void test() {
        for (int i = 20; i > 0; i--) {
            randomAi = 1 + (int) (Math.random() * 3);
            System.out.println(randomAi);
        }
    }
}