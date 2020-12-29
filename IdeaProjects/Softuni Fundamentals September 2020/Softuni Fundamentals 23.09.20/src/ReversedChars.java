import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = (char) scanner.nextLine().charAt(0);
        char b = (char) scanner.nextLine().charAt(0);
        char c = (char) scanner.nextLine().charAt(0);
        System.out.print(c + " ");
        System.out.print(b + " ");
        System.out.print(a);
    }
}
