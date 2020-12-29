import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s");

            switch (tokens[0]) {
                case "Add": {
                    int no = Integer.parseInt(tokens[1]);
                    numbers.add(no);
                    break;
                }
                case "Insert":
                        int no = Integer.parseInt(tokens[1]);
                        if (no >= 0 && no < numbers.size()) {
                            numbers.add(no, Integer.parseInt(tokens[1]));
                        } else {
                            System.out.println("Invalid index");
                    }
                    break;
                case "Remove": {
                    no = Integer.parseInt(tokens[1]);
                    if (no >= 0 && no < numbers.size()) {
                        numbers.remove(no);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                }
                case "Shift":
                    int count = Integer.parseInt(tokens[2]);
                    switch (tokens[1]) {
                        case "left":
                            for (int i = 0; i < count; i++) {
                                int first = numbers.get(0);
                                numbers.remove(0);
                                numbers.add(first);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < count; i++) {
                                int last = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size() - 1);
                                numbers.add(0, last);
                            }
                            break;

                    }
                    break;
            }
            input = scanner.nextLine();
            }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        }
    }

