import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Task3 task3 = new Task3();
        int[] myArray = task3.experimentsInput();

        task3.experimentsInput();
        task3.list(myArray);

    }

    private int[] experimentsInput() {
        int[] myArray = new int[1000];

        for (int i = 0; i < 1000; i++) {
            myArray[i] = (new Random().nextInt(12) + 1);
        }
        return myArray;
    }

    private void list(int[] myArray) {
        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < 1000; j++) {
                if (myArray[j] == i) {
                    counter++;
                }
            }
            sum = sum + counter;
            System.out.println("The voltage " + i + " occured " + counter + " times");
            counter = 0;
        }
        System.out.println(sum);
    }
}
