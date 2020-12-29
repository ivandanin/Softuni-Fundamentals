import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([ -~]+)\\>(?<numbers>\\d{3})(\\|)(?<lower>[a-z]{3})\\3(?<upper>[A-Z]{3})\\3(?<symbols>[^\\<\\>]{3})\\<\\1";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);



            if (matcher.find()) {
                String numbers = matcher.group("numbers");
                String lower = matcher.group("lower");
                String upper = matcher.group("upper");
                String symbols = matcher.group("symbols");

                String password = numbers + lower + upper + symbols;
                System.out.printf("Password: %s%n", password);
            } else {
                System.out.println("Try another password!");
            }
        }

    }
}
