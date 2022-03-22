import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Task7 task7 = new Task7();
        task7.digitCounter();
    }
    private void digitCounter(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input the String with digits shall be counted: ");
        String inputString = in.nextLine();
        System.out.println(inputString.length());
    }
}
