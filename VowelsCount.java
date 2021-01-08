import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        int vowels = 0;
        System.out.println(counter(vowels));
    }
    static int counter (int vowels) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {

                vowels++;

            }

        }
        return vowels;
    }
}
