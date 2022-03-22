public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(task3.variantOne(159));
        System.out.println(task3.adancedVariant(555001205));
    }

    private int variantOne(int x) {
        int twoGigitNumber = x / 10;
        int oneDigitNumber = twoGigitNumber / 10;
        return (x % 10) + (twoGigitNumber % 10) + (oneDigitNumber % 10);
    }

    private int adancedVariant(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
