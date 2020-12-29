import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> ints = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = scanner.nextLine().split(" ");


          if (tokens[0].equals("Remove")) {

              ints.remove(tokens[1]);
          } else if (tokens[0].equals("Add")) {
                ints.add(ints.size() - 1, tokens[1]);
            }

           input = scanner.nextLine();

        }
        for (String anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}
