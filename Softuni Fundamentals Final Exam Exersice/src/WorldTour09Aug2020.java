import java.util.Scanner;

public class WorldTour09Aug2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] tokens = input.split(":");
            String command = tokens[0];

            switch (command) {
                case "Add Stop":
                    if (stops.length() >= Integer.parseInt(tokens[1])) {
                        stops.insert(Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(stops);
                }
                    break;
                case "Remove Stop":
                if (stops.length() >= Integer.parseInt(tokens[1]) && stops.length() >= Integer.parseInt(tokens[2])) {
                    stops.delete(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]) + 1);
                    System.out.println(stops);
                }
                    break;
                case "Switch":
                    if (stops.toString().contains(tokens[1])) {
                        stops = new StringBuilder(stops.toString().replace(tokens[1], tokens[2]));
                        System.out.println(stops);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
