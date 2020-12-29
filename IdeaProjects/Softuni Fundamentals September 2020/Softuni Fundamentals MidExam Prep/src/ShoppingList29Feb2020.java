import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList29Feb2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] tokens = input.split(" ", 2);
            String command = tokens[0];
            String item = tokens[1];

            switch (command) {
                case "Urgent":
                    if (!groceries.contains(item)) {
                        groceries.add(item);
                        break;
                    }
                    break;
                case "Unnecessary":
                    groceries.remove(item);
                    break;
                case "Correct":
                    String[] change = item.split("\\s");
                    String oldItem = change[0];
                    String newItem = change[1];
                    if (groceries.contains(oldItem)) {
                        groceries.add(Integer.parseInt((change[0])),newItem);
                        groceries.remove(oldItem);

                        break;
                    }
                    break;
                case "Rearrange":
                    if (groceries.contains(item)) {
                        groceries.remove(item);
                        groceries.add(groceries.size(), item);
                        break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }

            System.out.print(String.join(", ", groceries));

    }
}
