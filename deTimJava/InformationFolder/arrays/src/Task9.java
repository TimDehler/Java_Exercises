import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Task9 task9 = new Task9();
        String password = task9.passwordInput();
        boolean ft = task9.validityCheck(password);
    }

    private String passwordInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type in the desired password: ");
        return in.nextLine();
    }

    private boolean validityCheck(String password) {
        boolean ft = false;

        if (password.length() < 10) {
            System.out.println("Your password is too short!");
        }

        if (password.contains(" ")) {
            System.out.println("Your password may not contain space!");
        }

        for (int i = 0; i < password.length(); i++) {
            int asciiVal = (int) password.charAt(i);

            if ((asciiVal >= 33 && asciiVal <= 47) || (asciiVal >= 58 && asciiVal <= 64)
                    || (asciiVal >= 91 && asciiVal <= 96) || (asciiVal >= 123 && asciiVal <= 126)) {
                System.out.println("Your password may not include special characters!");
            }
        }
        String numInPW = password.replaceAll("\\D", "");
        if (numInPW.length() >= 2) {
            ft = true;
        } else {
            System.out.println("Your password has to contain two numbers!");
        }
        if (!ft) {
            validityCheck(passwordInput());
        } else {
            System.out.println("Your password is valid!");
        }
        return ft;
    }
}



