import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestionationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([=/])(?<place>[A-Z][A-Za-z]{3,})\\1";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> places = new ArrayList<>();
        int points = 0;

        while (matcher.find()){
            places.add(matcher.group("place"));
            points += matcher.group("place").length();
        }
        System.out.print("Destinations: " + String.join(", ", places));
        System.out.printf("%nTravel Points: %d", points);
    }
}
