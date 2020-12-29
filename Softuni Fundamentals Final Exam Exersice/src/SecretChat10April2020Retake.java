import java.util.Scanner;

public class SecretChat10April2020Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
            String[] tokens = command.split(":\\|:");

            switch (tokens[0]) {
                case "InsertSpace":
                    input.replace(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[1]), " ");
                    System.out.println(input);
                    break;
                case "Reverse":
                    if (input.toString().contains(tokens[1])) {
                        StringBuilder substring = new StringBuilder(tokens[1]);
                        substring = substring.reverse();
                       input = new StringBuilder(input.toString().replace(tokens[1], ""));
                        input.append(substring);
                        System.out.println(input);
                    } else {
                        System.out.println("error");
                    }
                       break;
                case "ChangeAll":
                   input = new StringBuilder(input.toString().replace(tokens[1], tokens[2]));
                    System.out.println(input);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", input);
    }
}
