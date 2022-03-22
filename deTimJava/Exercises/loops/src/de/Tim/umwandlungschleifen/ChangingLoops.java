package de.Tim.umwandlungschleifen;

public class ChangingLoops {

    public static void main(String[] args) {
        ChangingLoops changingLoops = new ChangingLoops();
        changingLoops.start();


    }

    public void start() {
        /*headTested();
        bottomTested();
        headTestedWhileVariant();*/
        test();
    }

    public void headTested() {

        for (int i = 1; i < 11; i++) {
            System.out.print(i);
        }
        System.out.println("    stop");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.println("    stop");
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.print(i);
        }
        System.out.println("    stop");
    }

    public void headTestedWhileVariant() {
        int i = 1;
        while (i < 11) {
            System.out.print(i);
            i++;
        }
        System.out.println("    stop");

        int c = 10;
        while (c >= 1) {
            System.out.print(c);
            c--;
        }
        System.out.println("    stop");

        int b = 2;
        while (b <= 20) {
            System.out.print(b);
            b += 2;
        }
        System.out.println("    stop");

        int n = 1;
        while (n <= 19) {
            System.out.print(n);
            n += 2;
        }
        System.out.println("    stop");
    }

    public void bottomTested() {
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
        int i3 = 1;
        do {
            System.out.print(i3);
            i3 += 2;
        } while (i3 <= 19);
        System.out.println("    stop");
    }
    public void test(){
        for(char a = 65 ; a < 78; a++) {
            System.out.println(a);
        }

        for(char a = 122; a > 110; a--){
            System.out.println(a);
        }
    }
}

