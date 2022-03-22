import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.gradeList();

    }

    private void gradeList() {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> gradeList = new ArrayList<Integer>();

        int inputGrade;

        System.out.print("Put in the number of students: ");
        int numberOfStudents = in.nextInt();


        System.out.println("Put in the grades: ");
        int counter = 0;

        while (counter <= numberOfStudents) {
            for (int i = 0; i <= numberOfStudents; i++) {
                inputGrade = in.nextInt();
                if (inputGrade >= 0 && inputGrade <= 15) {
                    gradeList.add(inputGrade);
                    System.out.print("Grade number " + i + ":   " + gradeList.get(i) + "\n");
                    counter += 1;
                } else {
                    System.out.println("The grade has to be from 0 to 15 points!");
                    counter = 0;
                    break;
                }
            }
        }
        System.out.println("_________________________________________________");

        int minGrade = gradeList.get(0);
        int maxGrade = gradeList.get(0);

        for (int j = 1; j < gradeList.size(); j++) {
            if (gradeList.get(j) < minGrade) {
                minGrade = gradeList.get(j);

            }
            if (gradeList.get(j) > maxGrade) {
                maxGrade = gradeList.get(j);
            }
        }

        double sum = 0;
        for (Integer grade : gradeList) {
            sum += grade;
        }
        double average = sum / gradeList.size();

        double negativeCounter = 0;

        for (Integer integer : gradeList) {
            if (integer < 5) {
                negativeCounter += 1;
            }
        }
        double negShare = (negativeCounter / gradeList.size()) * 100;

        System.out.println("The negative share is: " + negShare + "%");
        System.out.println("The average is: " + average);
        System.out.println("The worst grade is: " + minGrade);
        System.out.println("The best grade is: " + maxGrade);

        System.out.println("_________________________________________________");


        for (int grade = 0; grade <= 15; grade++) {
            System.out.print(grade + ":   ");

            for (Integer integer : gradeList) {

                if (integer == grade) {
                    if (grade < 10) {
                        System.out.print(" *");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.println("_________________________________________________");
    }
}
