import java.util.*;
import java.util.stream.Stream;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Map<String, List<String>> listOfSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();


                listOfSynonyms.putIfAbsent(word, new ArrayList<>());
                listOfSynonyms.get(word).add(synonym);

        }
        for (Map.Entry<String, List<String>> entry : listOfSynonyms.entrySet()) {
            System.out.println(entry.getKey() +  " - " + String.join(", ", entry.getValue()));
        }
        }
    }

