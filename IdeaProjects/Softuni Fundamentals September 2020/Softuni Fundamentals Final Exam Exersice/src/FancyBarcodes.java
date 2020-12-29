import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String regex = "(\\@\\#+)([A-Z][A-Za-z0-9]{4,}[A-Z])\\1";
            Pattern pattern = Pattern.compile(regex);

            int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                Pattern digitPattern = Pattern.compile("\\d");
                matcher = digitPattern.matcher(text);
                String result = "";
                while (matcher.find()) {
                    result += matcher.group();
                } if (result.equals("")) {
                    result = "00";
                }
                System.out.printf("Product group: %s%n", result);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
