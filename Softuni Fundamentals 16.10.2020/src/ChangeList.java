import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s");

            if (tokens[0].equals("Delete")) {
                for (int i = 0; i < elements.size(); i++) {
                    int number = Integer.parseInt(tokens[1]);
                    elements.remove((Integer) number);
                }
            } else if (tokens[0].equals("Insert")) {
                int number = Integer.parseInt(tokens[2]);
                int el = Integer.parseInt(tokens[1]);
                    elements.add(number, el);

            }
            input = scanner.nextLine();
        }
        for (Integer element : elements) {
            System.out.print(element + " ");
        }

    }

}
