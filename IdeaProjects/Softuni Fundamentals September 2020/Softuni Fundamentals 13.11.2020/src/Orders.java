import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();
        Map<String, Double> totalPriceOfProduct = new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String[] tokens = input.split(" ");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
            }
            totalPriceOfProduct.put(product, productsQuantity.getOrDefault(product, quantity) * price);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : totalPriceOfProduct.entrySet()){
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
