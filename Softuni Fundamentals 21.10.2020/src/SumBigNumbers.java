import java.util.Scanner;
import java.math.BigInteger;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

BigInteger a = new BigInteger(scanner.nextLine());
BigInteger b = new BigInteger(scanner.nextLine());

BigInteger result = a.add(b);
        System.out.println(result);
    }
}
