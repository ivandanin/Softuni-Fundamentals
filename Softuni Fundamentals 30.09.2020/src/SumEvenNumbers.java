import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        String[] lineSpace = line.split(" ");
        int [] numbers = new int[lineSpace.length];

        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = Integer.parseInt(lineSpace[i]);
        }
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
