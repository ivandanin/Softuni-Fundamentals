import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NFS10April2020Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, int[]> cars = new HashMap<>();

      int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] car = scanner.nextLine().split("\\|");
            String model = car[0];
            int mileage = Integer.parseInt(car[1]);
            int fuel = Integer.parseInt(car[2]);
            int[] numbers = new int[]{mileage, fuel};

            cars.put(model, numbers);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] tokens = input.split(" : ");
            String command = tokens[0];
            String carModel = tokens[1];
            int amount = Integer.parseInt(tokens[2]);

            switch (command) {
                case "Drive":
                    int fuel = Integer.parseInt(tokens[3]);
                    if (cars.get(carModel)[1] < fuel) {
                        System.out.printf("Not enough fuel to make that ride%n");
                    } else if (cars.get(carModel)[1] >= fuel) {
                        cars.get(carModel)[0] += amount;
                        cars.get(carModel)[1] -= fuel;
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carModel, amount, fuel);
                    }if (cars.get(carModel)[0] >= 100000) {
                        cars.remove(carModel);
                        System.out.printf("Time to sell the %s!%n", carModel);
                    }
                    break;
                case "Refuel":
                        if (cars.get(carModel)[1] + amount > 75) {
                            amount = 75 - cars.get(carModel)[1];
                            cars.get(carModel)[1] = 75;
                        } else {
                            cars.get(carModel)[1] += amount;
                        }
                    System.out.printf("%s refueled with %d liters%n", carModel, amount);
                    break;
                case "Revert":
                        if (cars.get(carModel)[0] - amount <= 10000) {
                            amount = 10000 + cars.get(carModel)[0];
                            cars.get(carModel)[0] = 10000;
                        } else {
                            cars.get(carModel)[0] -= amount;
                            System.out.printf("%s mileage decreased by %d kilometers%n", carModel, amount);
                        }
                    break;
            }
            input = scanner.nextLine();
        }
        cars.entrySet().stream()
                .sorted((a, b) -> {int result = b.getValue()[0] - a.getValue()[0];
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(h -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                h.getKey(), h.getValue()[0], h.getValue()[1]));
    }
}
