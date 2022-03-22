public class Task9 {

    public static void main(String[] args) {
        Task9 task9 = new Task9();
        task9.fibonacciIterativ(25);
    }

    private int fibonacciIterativ(int n) {
        int fibonacciNumber = 0;
        if (n < 2) {
            return n;
        }
        int prevFib = 1;
        int prevPrevFib = 0;
        for (int i = 2; i <= n; i++) {
            fibonacciNumber = prevFib + prevPrevFib;
            prevPrevFib = prevFib;
            prevFib = fibonacciNumber;
        }
        return fibonacciNumber;
    }
}
