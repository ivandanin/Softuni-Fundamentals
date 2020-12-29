import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String commands = scanner.nextLine();

        String word = "";
        while (!commands.equals("Done")) {
            String[] tokens = commands.split(" ");
            String command = tokens[0];

            switch (command) {
                case "TakeOdd":
                    for (int i = 0; i < input.length(); i++) {
                        if (i % 2 == 1) {
                            word += (input.charAt(i));
                    }
                    }
                    System.out.println(word);
                    break;
                case "Cut":
                int index = Integer.parseInt(tokens[1]);
                int length = index + Integer.parseInt(tokens[2]);
                String remove = word.substring(index, length);
                word = word.replace(remove, "");
                    System.out.println(word);
                    break;
                case "Substitute":
                if (word.contains(tokens[1])) {
                    word = word.replace(tokens[1], tokens[2]);
                    System.out.println(word);
                } else {
                    System.out.println("Nothing to replace!");
                }
                    break;
            }

            commands = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", word);
    }
}
