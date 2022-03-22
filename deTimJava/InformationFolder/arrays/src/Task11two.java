public class Task11two {

    public static void main(String[] args) {
        int[] prison = new int[1000];
        Task11two task11two = new Task11two();
        task11two.surviveCalc(prison);

    }

    private void surviveCalc(int[] prison) {

        for (int guardcount = 1; guardcount <= 1000; guardcount++) {
            if (guardcount % 2 == 0) {
                for (int doornumber = 999; doornumber >= 0; doornumber--) {
                    if ((doornumber + 1) % guardcount == 0) {
                        prison[doornumber] += 1;
                    }
                }
            } else {
                for (int doornumber = 0; doornumber < 1000; doornumber++) {
                    if ((doornumber + 1) % guardcount == 0) {
                        prison[doornumber] += 1;
                    }
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

