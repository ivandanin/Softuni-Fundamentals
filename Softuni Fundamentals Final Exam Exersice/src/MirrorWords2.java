import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([@#])(?<word1>[A-Za-z]{3,})\\1{2}(?<word2>[A-Za-z]{3,})\\1";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        Map<String, String> pairs = new LinkedHashMap<>();
        Map<String, String> matches = new LinkedHashMap<>();

        while (matcher.find()) {
            StringBuilder word1 = new StringBuilder(matcher.group("word1"));
            StringBuilder word2 = new StringBuilder(matcher.group("word2"));

            pairs.put(word1.toString(), word2.toString());

            if (pairs.size() == 0) {
                System.out.println("No word pairs found!");
            } else {
                pairs.size();
            }
        if (word1 == word2.reverse()) {
            matches.put(word1.toString(), word2.toString());
        } else if (!(word1 == word2.reverse())) {
            System.out.println("No mirror words!");
        }
        }
        System.out.printf("%d word pairs found!", pairs.size());
        if (matches.size() > 0) {
            for (Map.Entry<String, String> entry : matches.entrySet()) {
                System.out.printf("The mirror words are:%n%s <=> %s",
                        entry.getKey(), entry.getValue());
            }
        }
    }
}
