import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline29Feb2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHealth = 100;
        int initialBitcoins = 0;

        String[] rooms = scanner.nextLine().split("\\|");

        for (int i = 0; i < rooms.length; i++) {
            String[] content = rooms[i].split(" ");
            String command = content[0];
            int number = Integer.parseInt(content[1]);

            switch (command) {
                case "potion":
                    if (initialHealth + number > 100) {
                        number = 100 - initialHealth;
                    }
                        initialHealth += number;
                        System.out.printf("You healed for %d hp.%n", number);
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                        break;

                case "chest":
                    initialBitcoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                    if (initialHealth - number <= 0) {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", (i + 1));
                        return;
                    } else {
                        initialHealth -= number;
                        System.out.printf("You slayed %s.%n", command);
                    }
            }
        }
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", initialBitcoins, initialHealth);
    }
}
