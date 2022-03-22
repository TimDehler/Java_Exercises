import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Task8 task8 = new Task8();
        task8.countWords();
    }
    private void countWords(){
        Scanner in = new Scanner(System.in);
        System.out.print("Put in the sentence which words shall be counted: ");
        String inputString = in.nextLine();

        int wordCounter = 0;

        for (String splitString: inputString.split(" ")){
            wordCounter++;
            System.out.println(splitString);
        }
        System.out.println("The sentence has: "+wordCounter+" words");
    }
}
