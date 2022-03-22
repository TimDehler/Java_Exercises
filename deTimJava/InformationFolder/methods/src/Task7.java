public class Task7 {

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        System.out.println("The facutly of the number n is " + task7.calculateFacultyRecursion(5));
        System.out.println("The faculty of the number n is " + task7.calculateFacultyIteration(5));
    }

    private int calculateFacultyRecursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calculateFacultyRecursion(n - 1);
        }
    }

    private int calculateFacultyIteration(int n) {
        int faculty = 1;
        if(n == 0){
            return 1;
        }
        for (int i = 1; i <= n ; i++) {
            faculty *= i;
        }
        return faculty;
    }
}
