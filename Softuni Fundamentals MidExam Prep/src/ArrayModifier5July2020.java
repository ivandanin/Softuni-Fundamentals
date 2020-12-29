import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier5July2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split(" ");
            String command = tokens[0];
            int index1 = Integer.parseInt(tokens[1]);
            int index2 = Integer.parseInt(tokens[2]);
            int indexSwapped = 0;

            if (command.equals("swap")){
                for (int i = 0; i < numbers.length; i++) {
                    indexSwapped = index1;
                    index1 = index2;
                }
            } else if (input.equals("multiply")) {

            }

            input = scanner.nextLine();
        }
    }
}
