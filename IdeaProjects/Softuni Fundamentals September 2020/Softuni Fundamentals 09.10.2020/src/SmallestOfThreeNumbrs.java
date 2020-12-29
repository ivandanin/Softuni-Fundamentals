import java.util.Scanner;

public class SmallestOfThreeNumbrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestInt(a, b, c));
    }

    static int smallestInt (int a, int b, int c) {
        if (a < b && a < c)
            return a;
        if (b < a && b < c)
            return b;
        if (c < a && c < b)
            return c;
        return a;
    }
}
