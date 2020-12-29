import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random randomGenerator = new Random();
        for (int i = 0; i < words.length; i++) {
            int x = randomGenerator.nextInt(words.length);
            int y = randomGenerator.nextInt(words.length);
            String oldWordsX = words[x];
            words[x] = words[y];
            words[y] = words[x];
            words[y] = oldWordsX;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
