public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.terminate(3, 4, 1));
        System.out.println(task2.terminate(2.3, 1.4, 4.5));
    }

    private int terminate(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    private double terminate(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
