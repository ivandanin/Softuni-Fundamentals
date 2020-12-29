import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, int[]> players = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Results")) {
            String[] tokens = input.split(":");
            String command = tokens[0];


            switch (command) {
                case "Add":
                    String person = tokens[1];
                    int health = Integer.parseInt(tokens[2]);
                    int energy = Integer.parseInt(tokens[3]);
                    int [] numbers = new int[]{health, energy};

                    if (players.containsKey(person)) {
                        players.get(person)[0] += health;
                    } else {
                        players.put(person, numbers);
                    }
                    break;
                case "Attack":
                    String attackerName = tokens[1];
                    String defenderName = tokens[2];
                    int damage = Integer.parseInt(tokens[3]);
                if (players.containsKey(attackerName) && players.containsKey(defenderName)) {
                    players.get(defenderName)[0] -= damage;
                    if (players.get(defenderName)[0] <= 0) {
                        players.remove(defenderName);
                        System.out.printf("%s was disqualified!%n", defenderName);
                    }
                    players.get(attackerName)[1] -= 1;
                    if (players.get(attackerName)[1] == 0) {
                        players.remove(attackerName);
                        System.out.printf("%s was disqualified!%n", attackerName);
                    }
                }
                    break;
                case "Delete":
                    String username = tokens[1];
                    if (players.containsKey(username)) {
                        players.remove(username);
                    } else if (username.equals("All")) {
                        players.clear();
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("People count: %d%n", players.size());
        players.entrySet().stream()
                .sorted((a, b) -> {int result = b.getValue()[0] - a.getValue()[0];
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(p -> System.out.printf("%s - %d - %d%n",p.getKey(), p.getValue()[0], p.getValue()[1]));
    }
}
