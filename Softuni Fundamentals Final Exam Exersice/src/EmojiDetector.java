import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String digitCheck = "\\d";
        Pattern digitPattern = Pattern.compile(digitCheck);
        Matcher digitMatcher = digitPattern.matcher(text);

        int sum = 1;
        while (digitMatcher.find()) {
            int numbers = Integer.parseInt(digitMatcher.group());
            sum *= numbers;
        }
        System.out.printf("Cool threshold: %d%n", sum);

        String expressionOfEmojis = "(?<emoji>([:*]{2})[A-Z][a-z]{2,}\\2)";
        Pattern patternOfEmojis = Pattern.compile(expressionOfEmojis);
        Matcher emojiMatcher = patternOfEmojis.matcher(text);

        int coolness = 0;
        Map<String, Integer> emojiRang = new LinkedHashMap<>();
        List<String> emojisFound = new ArrayList<>();


        while (emojiMatcher.find()) {
            String emojis = emojiMatcher.group("emoji");
            emojisFound.add(emojiMatcher.group("emoji"));
            for (int j = 0; j < emojis.length(); j++) {
                int charArray = emojis.charAt(j);
                coolness += charArray;
            }
            if (coolness >= sum) {
                emojiRang.put(emojis, coolness);
            }
                coolness = 0;
                }

        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojisFound.size());
        for (Map.Entry<String, Integer> entry : emojiRang.entrySet()) {
                System.out.printf("%s %n", entry.getKey());
        }
    }
}
