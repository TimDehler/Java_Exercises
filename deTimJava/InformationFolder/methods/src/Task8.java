public class Task8 {
    public static void main(String[] args) {
        Task8 task8 = new Task8();
        System.out.println("The fibonacci number at place n is  " + task8.fibonacciRecursive(25));
    }

    private int fibonacciRecursive(int n) {
        int fibonacciNumber = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            fibonacciNumber = fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
            return fibonacciNumber;
        }
    }
}
/*
    n = 6
    fibonacciNumber = 0     1   2   3   5   8
    prevFib = 1             1   2   3   5   8
    prevPrevFib = 0         1   1   2   3   5
    i = 2                   3   4   5   6   7

    fibonacciRow(0)=0
    fibonacciRow(1)=1
    fibonacciRow(n)=fibonacciRow(n-1)+fibonacciRow(n-2)
    f(2)=f(1)+f(0)= 1 + 0 = 1
    0 1 1 2 3 5 8 13 ...
    0 1 2 3 4 5 6  7 ...
*/

