import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        Scanner in = new Scanner(System.in);
        System.out.print("Type in the value of radiation: ");
        int startinValue = in.nextInt();
        System.out.println("The radiation value will be in a safe range within the next " + task5.time1(startinValue) + " hours");
    }

    public int time1(int startingvalue) {
        int hours = 0;
        for (int i = startingvalue; i > 100; i = i * 95 / 100) {
            hours += 1;
        }
        return hours;
    }
}
