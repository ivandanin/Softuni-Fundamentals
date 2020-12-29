import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SugarCubes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sugarCubes = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Mort")) {
            String[] tokens = input.split(" ", 2);
            String command = tokens[0];
            String number = tokens[1];

            switch (command) {
                case "Add":
                    sugarCubes.add(number);
                    break;
                case "Remove":
                    sugarCubes.remove(number);
                    break;
                case "Replace":
                    String[] change = number.split("\\s");
                    String oldElement = change[0];
                    String newElement = change[1];
sugarCubes.set(sugarCubes.indexOf(oldElement), newElement);
                    break;
                case "Collapse":
                    for (int i = 0; i < sugarCubes.size(); i++) {
                        if (Integer.parseInt(sugarCubes.get(i)) < Integer.parseInt(number)){
                            sugarCubes.remove(i);
                            i--;
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(" ", sugarCubes));
    }
}
//100/100