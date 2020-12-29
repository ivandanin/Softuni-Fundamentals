import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bomb = Integer.parseInt(scanner.next());
        int power = Integer.parseInt(scanner.next());


        while (numbers.contains(bomb)) {
            int bombPosition = numbers.indexOf(bomb);
 int left = Math.max(0, bombPosition - power);
 int right = Math.min(numbers.size() - 1, bombPosition + power);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
            }
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;

            }
            System.out.println(sum);
        }

    }



