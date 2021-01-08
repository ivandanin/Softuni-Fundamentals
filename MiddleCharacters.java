import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();
            System.out.println(middleChar(word));

    }
    static String middleChar (String word) {
        if (word.length() % 2 == 0) {
            word = word.substring(word.length() / 2 - 1, (word.length() / 2) + 1);
        } else {
            word = word.substring(word.length() / 2, (word.length() / 2 + 1));
        }
        return word;
    }
}

