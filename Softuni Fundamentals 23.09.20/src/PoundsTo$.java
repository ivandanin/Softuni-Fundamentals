import java.util.Scanner;

public class PoundsTo$ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());

        double   dollar = 1.31;
        double result = pounds * dollar;
        System.out.printf("%.3f", result);
    }
}
