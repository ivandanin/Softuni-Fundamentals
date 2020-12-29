import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int a = n * 2;
        for (int i = 1; i < a; i+= 2) {
            System.out.println(i);
        }
        System.out.printf("Sum: %d", n * n);
    }
}
