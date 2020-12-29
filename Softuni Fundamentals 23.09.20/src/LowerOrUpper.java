import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = (char) scanner.next().charAt(0);

        boolean upper = Character.isUpperCase(ch);
        boolean lower = Character.isLowerCase(ch);
        if (upper) {
            System.out.println("upper-case");
        } else if (lower) {
            System.out.println("lower-case");
        }
    }
}
