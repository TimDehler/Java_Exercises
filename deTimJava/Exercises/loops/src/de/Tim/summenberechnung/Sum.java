package de.Tim.summenberechnung;

import java.util.Scanner;

public class Sum {

    private Scanner in;

    public Sum() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.programmstart();
    }

    public void programmstart() {
        System.out.print("Type in number to sum up to: ");
        int input = in.nextInt();
        int sum = 0;

        for(int i = 0; i <= input; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
