import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery29Feb2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houseNumber = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Love!")) {
        String[] command = input.split(" ");
        String jump = command[0];
        int numberOfJumps = Integer.parseInt(command[1]);

            for (int i = 0; i < houseNumber.size(); i += numberOfJumps) {

                houseNumber.set(i, Integer.valueOf(String.valueOf(i - 2)));
            }

            input = scanner.nextLine();
        }
        System.out.println(houseNumber);
    }
}

