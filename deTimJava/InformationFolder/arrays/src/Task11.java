public class Task11 {
    public static void main(String[] args) {
        int[] prison = new int[1000];
        Task11 task11 = new Task11();
        task11.surviveCalc(prison);

    }

    private void surviveCalc(int[] prison) {

        //All guards
        for (int guardcount = 1; guardcount <= 1000; guardcount++) {
            for (int doornumber = 0; doornumber < 1000; doornumber++) {
                if ((doornumber + 1) % guardcount == 0) {
                    prison[doornumber] += 1;
                }
            }
        }
        System.out.println("The doors are marked!");
        for (int i = 0; i < 1000; i++) {
            System.out.print("Door " + (i + 1) + ": ");
            System.out.println(prison[i]);
        }

        for (int i = 0; i < 1000; i++) {
            if (prison[i] == 2) {
                System.out.println("Door " + (i + 1) + " is safe: " + prison[i]);
            }

        }
    }
}
