import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String expression = ">>(?<name>[A-Z][A-Za-z]+)<<(?<price>\\d+\\.?\\d+)\\!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(expression);

        List<String> purchases = new ArrayList<>();
        double costs = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                purchases.add(name);
                costs += (price * quantity);
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        purchases.forEach(print -> System.out.println(print));
        System.out.printf("Total money spend: %.2f", costs);
    }
}
