import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, int[]> targeted = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")){
            String[] tokens = input.split("\\|\\|");
            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);
            int[] numbers = new int[]{population, gold};

            targeted.put(city, numbers);

            input = scanner.nextLine();
        }
        String string = scanner.nextLine();
        while (!string.equals("End")) {
            String[] commands = string.split("=>");
            String command = commands[0];
            String city = commands[1];
            int amount = Integer.parseInt(commands[2]);

            switch (command) {
                case "Plunder":
                int gold = Integer.parseInt(commands[3]);
                targeted.get(city)[0] -= amount;
                targeted.get(city)[1] -= gold;
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                            city, gold, amount);
        if (targeted.get(city)[0] - amount <= 0 || targeted.get(city)[1] - gold <= 0) {
            targeted.remove(city);
            System.out.printf("%s has been wiped off the map!%n", city);
        }
                    break;
                case "Prosper":
                    if (amount >= 0) {
                targeted.get(city)[1] += amount;
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                amount, city, targeted.get(city)[1]);
                    } if (amount < 0) {
                    System.out.printf("Gold added cannot be a negative number!%n");
                }
                    break;
            }

            string = scanner.nextLine();
        } if (targeted.size() == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",
                    targeted.size());
            targeted.entrySet().stream()
                    .sorted((a, b) -> {
                        int result = b.getValue()[1] - a.getValue()[1];
                        if (result == 0) {
                            result = a.getKey().compareTo(b.getKey());
                        }
                        return result;
                    }).forEach(t -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                    t.getKey(), t.getValue()[0], t.getValue()[1]));
    }
}
}