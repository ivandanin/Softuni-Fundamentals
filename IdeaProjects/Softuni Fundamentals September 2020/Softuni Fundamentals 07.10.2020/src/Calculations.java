import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(a, b);
                break;
            case "subtract":
                subtract(a,b);
                break;
            case "multiply":
                multiply(a, b);
                break;
            case "divide":
                divide(a,b );
                break;
        }
    }
    static void add (int one, int two) {
        int result = one + two;
        System.out.println(result);
    }
    static void subtract (int one, int two) {
        int result = one - two;
        System.out.println(result);
    }
    static void multiply (int one, int two) {
        int result = one * two;
        System.out.println(result);
    }
    static void divide (int one, int two) {
        int result = one / two;
        System.out.println(result);
    }
}
