import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> registration = new LinkedHashMap<>();
        String input = scanner.nextLine();

        for (int i = 0; i <= numberOfCommands; i++) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            String username = tokens[1];
            String licensePlateNumber = tokens[2];
        if (command.equals("register")) {

            if (!registration.containsKey(username)) {
                registration.put(username, licensePlateNumber);
                System.out.printf("%s registered %s successfully%n", registration.get(username), registration.get(licensePlateNumber));
            } else if (registration.containsKey(username)) {
                System.out.printf("ERROR: already registered with plate number %s%n", registration.get(licensePlateNumber));
            }

        } else if (command.equals("unregister")) {


            if (!registration.containsKey(username)) {
                System.out.printf("ERROR: user %s not found%n", registration.get(username));
            } else if (registration.containsKey(username)) {
                System.out.printf("%s unregistered successfully%n", registration.get(username));
            }
            }
            input = scanner.nextLine();
    }
        if (!registration.isEmpty()) {
            for (Map.Entry<String, String> entry : registration.entrySet())
                System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
}
}
