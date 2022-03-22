import java.util.ArrayList;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Task13 task13 = new Task13();
        ArrayList<String> myArrayList = task13.input();
        task13.iterativeMethod(myArrayList);
        System.out.println("\n");
        task13.recursiveMethod(myArrayList);

    }

    private ArrayList<String> input() {
        ArrayList<String> myArrayList = new ArrayList<>();
        System.out.println("Put in the digits of your ArrayList: ");
        Scanner in = new Scanner(System.in);
        String row = "";
        while (!row.equals("!")) {
            row = in.nextLine();
            if (!row.equals("!")) {
                myArrayList.add(row);
            }
        }

        System.out.println(myArrayList);
        return myArrayList;
    }

    private void iterativeMethod(ArrayList<String> myArrayList) {
        for(int i = myArrayList.size()-1; i >= 0; i--){
            System.out.print(myArrayList.get(i));
        }
    }
    private void recursiveMethod(ArrayList<String> myArrayList){
        int x = myArrayList.size() -1;
        if (myArrayList.size() != 0){
            System.out.print(myArrayList.get(x));
            myArrayList.remove(x);
            recursiveMethod(myArrayList);
        }
    }
}


