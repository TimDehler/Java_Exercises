import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        int[] myArray = task4.createArray();
        System.out.println("Sum: " + task4.sum(myArray));
        System.out.println("Min: " + task4.min(myArray));
        System.out.println("Max: " + task4.max(myArray));
        System.out.println("Average: " + task4.average(myArray));
        System.out.println("Variance: " + task4.variance(myArray));
    }

    private int[] createArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Put in how many digits the array may have: ");
        int arraySize = in.nextInt();
        int[] myArray = new int[0];
        if (arraySize > 20) {
            System.out.println("The length of the array may not be longer than 20 digits!");
            createArray();
        } else {
            myArray = new int[arraySize];
            for (int i = 0; i < myArray.length; i++) {
                int max = 100;
                int min = 0;
                myArray[i] = (new Random().nextInt(max - min) + min);
            }
            for (int j : myArray) {
                System.out.print(" / " + j);
            }
            System.out.println(" / ");
        }
        return myArray;
    }

    private int sum(int[] myArray) {
        int sum = 0;
        for (int j : myArray) {
            sum = sum + j;
        }
        return sum;
    }

    private int min(int[] myArray) {
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }

    private int max(int[] myArray) {
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    private int average(int[] myArray) {
        return sum(myArray) / myArray.length;
    }


    private int variance(int[] myArray) {
        int average = average(myArray);
        int topVariance = average - min(myArray);
        int bottomVariance = max(myArray) - average;

        topVariance *= topVariance;
        bottomVariance *= bottomVariance;
        return (topVariance + bottomVariance) / (myArray.length - 1);
    }

    /*
    private int positiveNumberCount(){

    }
    */
}
