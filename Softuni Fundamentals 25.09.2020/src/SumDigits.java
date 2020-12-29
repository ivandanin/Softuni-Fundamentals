import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = (scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < number.length() ; i++) {
            int currentNum = (int) number.charAt(i) - 48;
            sum += currentNum;

        }
        System.out.print(sum);
    }
}
