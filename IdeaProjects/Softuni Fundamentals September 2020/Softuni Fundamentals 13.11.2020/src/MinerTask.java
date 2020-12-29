import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();


        while (!input.equals("stop")) {

            String resources = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourcesQuantity.containsKey(resources)) {
                resourcesQuantity.put(resources, quantity);
            } else {

                resourcesQuantity.put(resources, resourcesQuantity.get(resources) + quantity);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesQuantity.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
