import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = "%(?<customer>[A-Z][a-z]+)%<(?<product>[A-Za-z]+)>([a-z]*)(\\|)(?<count>\\d+)\\4[a-z]*(?<price>\\d+?.\\d*)\\$";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(expression);

        double total = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                total += (count * price);

                System.out.printf("%s: %s - %.2f%n", customer, product, (count * price));
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",total);
    }
}