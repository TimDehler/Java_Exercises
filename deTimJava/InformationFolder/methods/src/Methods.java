import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Methods {

    private Scanner in;

    public Methods() {
        in = new Scanner(System.in);
    }

    int c = 3;
    //c is a classwide variable

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.parametersArgumentsVariables(1, 2));
        // a,b are arguments because they are passed into a method
        methods.methodExit();
    }

    private int parametersArgumentsVariables(int a, int b) {
        //a, b are parameters here
        return a + b + c;
        //c still is a variable

    }

    private void methodExit() {
        final int input = 1;
        int y = 10;
        //System.out.println("Put in a number: ");
        //input = in.nextInt();

        switch (input) {
            case 1 -> System.out.println("right");
            case 2 -> System.out.println("false");
            case 3 -> System.out.println("false");
            case 4 -> System.out.println("false");
            case 5 -> System.out.println("false");
            default -> System.out.println("Error");
        }
    }
}
