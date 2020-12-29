import java.util.Scanner;

public class PassValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();



if (checkIfIsBetween(password) &&
checkIfConsists(password) &&
checkIfHaveTwoDigits(password)) {
    System.out.println("Password is valid");
}
if (!checkIfIsBetween(password)) {
    System.out.println("Password must be between 6 and 10 characters");
}
if (!checkIfConsists(password)) {
    System.out.println("Password must consist only of letters and digits");
}
if (!checkIfHaveTwoDigits(password)) {
    System.out.println("Password must have at least 2 digits");
}
    }

    static boolean checkIfIsBetween (String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
    static boolean checkIfConsists (String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol) ;
            boolean isDigit = Character.isDigit(symbol);

            if (!isLetter && !isDigit) {
                return false;
            }

        }
        return true;

    }
    static boolean checkIfHaveTwoDigits (String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(0);
            if (Character.isDigit(symbol));
            counter++;
        }
        if (counter >= 2) {
            return true;
        }
        return false;
    }

}
