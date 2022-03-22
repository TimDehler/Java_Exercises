package de.Tim.richtigeschleifefinden;

public class ChooseTheLoop {

    public static void main(String[] args) {
        ChooseTheLoop chooseTheLoop = new ChooseTheLoop();
        chooseTheLoop.start();
    }

    public void start() {
        int i = 1;
        do {
            System.out.print(i);
            i++;
        } while (i <= 10);
        System.out.println("    stop");

        int i1 = 10;
        do {
            System.out.print(i1);
            i1--;
        } while (i1 > 0);
        System.out.println("    stop");

        for (int v = 2; v <= 20; v = v + 2) {
            System.out.print(v);
        }
        System.out.println("    stop");

        for (int c = 2; c <= 20; c = c + 2) {
            System.out.print(c);
        }
        System.out.println("    stop");
    }
}
