import java.util.Scanner;

public class MultiplicationTableVol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int a = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < 11 ; i++) {
            int mtpl = n * a;
            System.out.printf("%d X %d = %d%n", n, a, mtpl);
        }
    }
}
