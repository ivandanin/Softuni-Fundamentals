import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstFact = Integer.parseInt(scanner.nextLine());
        int secondFact = Integer.parseInt(scanner.nextLine());

        double result = factorial(firstFact) * 1.0 / factorial(secondFact);

        System.out.printf("%.2f", result);

    }

    static double factorial (int a) {
        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }
}
