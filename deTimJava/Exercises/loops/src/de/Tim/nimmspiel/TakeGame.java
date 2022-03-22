package de.Tim.nimmspiel;

import java.util.Scanner;

public class TakeGame {

    private Scanner in;

    public TakeGame() {
        in = new Scanner(System.in);
    }

    int inputnumber;
    int player;

    public static void main(String[] args) {
        TakeGame takeGame = new TakeGame();
        takeGame.startgame();

    }

    public void startgame() {
        player = 0;

        for (int i = 13; i > 0; i = i - inputnumber) {
            if (player == 1) {
                player = 0;
            }else{
                player = 1;
            }
            System.out.println("Player " + player);
            System.out.println("Number of sticks " + i);
            do{
                System.out.println("Type in a number from 1 to 3!");
                inputnumber = in.nextInt();
                if (inputnumber < 1 || inputnumber > 3) {
                    System.out.println("Non valid input");
                }
            }while(inputnumber < 1 || inputnumber > 3);


        }
        System.out.println("Player " + player + " won the game!");
    }
}
