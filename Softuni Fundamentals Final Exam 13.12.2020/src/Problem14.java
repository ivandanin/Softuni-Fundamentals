import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder username = new StringBuilder(scanner.nextLine());
        String commands = scanner.nextLine();

        while (!commands.equals("Sign up")) {
            String[] tokens = commands.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Case":
                    if (tokens[1].equals("upper")) {
                    username = new StringBuilder(username.toString().toUpperCase());
                    } else if (tokens[1].equals("lower")) {
                        username = new StringBuilder(username.toString().toLowerCase());
                    }
                    System.out.println(username);
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    StringBuilder reversedUser = new StringBuilder(username);
                    if (username.length() >= endIndex + 1) {
                       StringBuilder sub = new StringBuilder(reversedUser.substring(startIndex, endIndex + 1));
                       reversedUser = new StringBuilder(reversedUser.toString().replace(sub, sub.reverse()));
                        System.out.println(sub);
                    }
                    break;
                case "Cut":
                    String substring = tokens[1];
                    if (username.toString().contains(substring)) {
                        username = new StringBuilder(username.toString().replace(substring, ""));
                        System.out.println(username);
                    } else {
                        System.out.printf("The word %s doesn't contain %s.", username, substring);
                    }
                    break;
                case "Replace":
                    String replacement = tokens[1];
                    username = new StringBuilder(username.toString().replaceAll(replacement, "\\*"));
                    System.out.println(username);
                    break;
                case "Check":
                    String character = tokens[1];
                    if (username.toString().contains(character)) {
                        System.out.println("Valid");
                    } else {
                        System.out.printf("Your username must contain %s.", character);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
    }
}
