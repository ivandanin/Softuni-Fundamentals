import java.util.Scanner;

public class ActivationKeys04April2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder key = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {
            String[] operations = command.split(">>>");

            switch (operations[0]) {
                case "Contains":
                    if (key.toString().contains(operations[1])) {
                        System.out.printf("%s contains %s", key, operations[1]);
                    } else if (!key.toString().contains(operations[1])) {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    switch (operations[1]) {
                        case "Upper":
                            key.replace(Integer.parseInt(operations[2]), Integer.parseInt(operations[3]),
                                    key.substring(Integer.parseInt(operations[2]), Integer.parseInt(operations[3])).toUpperCase());
                            break;
                        case "Lower":
                            key.replace(Integer.parseInt(operations[2]), Integer.parseInt(operations[3]),
                                    key.substring(Integer.parseInt(operations[2]), Integer.parseInt(operations[3])).toLowerCase());
                            break;
                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    key.delete(Integer.parseInt(operations[1]), Integer.parseInt(operations[2]));
                    System.out.println(key);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", key);
        }
    }

