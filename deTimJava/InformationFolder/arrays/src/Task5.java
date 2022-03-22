import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.stringAsArray();
    }

    private void stringAsArray() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        int digit = (int) inputString.length() / 2;
        System.out.println(inputString.charAt(digit));
    }


}
