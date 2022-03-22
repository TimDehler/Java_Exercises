package de.Tim.fakultaet;

import java.util.Scanner;

public class Faculty {

    private Scanner in;

    public Faculty() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.start();

    }

    public void start() {
        System.out.print("Type in the nummber for which the faculty should be reckoned: ");
        int input = in.nextInt();

        int sum = 1;

        for (int i = 1; i <= input; i++) {
            sum = sum * i;
        }
        System.out.print(sum);
    }
}
