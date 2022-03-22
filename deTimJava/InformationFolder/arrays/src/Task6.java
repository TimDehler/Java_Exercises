import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.vocalCounter();
    }

    private void vocalCounter() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        int aCounter = 0, eCounter = 0, iCounter = 0, oCounter = 0, uCounter = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                aCounter += 1;
            } else if (inputString.charAt(i) == 'e') {
                eCounter += 1;
            } else if (inputString.charAt(i) == 'i') {
                iCounter += 1;
            } else if (inputString.charAt(i) == 'o') {
                oCounter += 1;
            } else if (inputString.charAt(i) == 'u') {
                uCounter += 1;
            }
        }
        System.out.println("a: " + aCounter + "\n e: " + eCounter + "\n i: " + iCounter + "\n o: " + oCounter + "\n u: " + uCounter + "\n u: " + uCounter);
    }
}
