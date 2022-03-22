import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    private Scanner in;

    public Task1() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.array();
        task1.arrayList();
        task1.rdVersionMod();

    }

    private void array() {
        double[] array = {Math.random(), Math.random(), Math.random()};
        for (double v : array) {
            System.out.print(" " + v);
        }
        System.out.println("");
    }

    private void arrayList() {
        ArrayList<Double> arrayList = new ArrayList<Double>();
        arrayList.add(Math.random());
        arrayList.add(Math.random());
        arrayList.add(Math.random());
        System.out.println(arrayList);
    }

    private void rdVersionMod() {

        double firstListItem = Math.random() * 100;
        firstListItem = Math.round(firstListItem);
        double secondListItem = Math.random() * 100;
        secondListItem = Math.round(secondListItem);
        double thirdListItem = Math.random() * 100;
        thirdListItem = Math.round(thirdListItem);

        double[] array = {firstListItem, secondListItem, thirdListItem};
        for (double arraysElement : array) {
            System.out.print(" " + arraysElement);
        }
        System.out.print("\n Type in new Value for third Item: ");
        array[2] = (in.nextDouble());
        for (double arraysElement : array) {
            System.out.print(" " + arraysElement);
        }
        System.out.println("");

        ArrayList<Double> arrayList = new ArrayList<Double>();
        arrayList.add(firstListItem);
        arrayList.add(secondListItem);
        arrayList.add(thirdListItem);

        System.out.println(arrayList);

        System.out.print("Type in new value of third digit: ");
        arrayList.set(arrayList.indexOf(thirdListItem), in.nextDouble());

        System.out.println(arrayList);
    }
}
