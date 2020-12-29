import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordsLowerCase = word.toLowerCase();
            if (counts.containsKey(wordsLowerCase)) {
                counts.put(wordsLowerCase, counts.get(wordsLowerCase) + 1);
            } else {
                counts.put(wordsLowerCase, 1);
            }
        }
        List <String> odds = new ArrayList<>();

        for(var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
