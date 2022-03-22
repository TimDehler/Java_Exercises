public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.terminate(5,7,2));
    }

    private int terminate(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }
}
