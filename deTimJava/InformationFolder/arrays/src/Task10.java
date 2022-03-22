import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Task10 task10 = new Task10();
        task10.task10();
    }

    private void task10() {
        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (new Random().nextInt(9) + 1);
        }

        int counter = 0;

        for (int j = 1; j <= 9; j++) {
            for (int k : myArray) {
                if (j == k) {
                    counter++;
                }
            }
            System.out.println(j + ": " + counter);
            counter = 0;
        }
    }
}
