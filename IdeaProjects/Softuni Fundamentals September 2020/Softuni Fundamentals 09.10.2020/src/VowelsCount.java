import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int vowels = 0;

        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;

            }
        }
        System.out.println(vowels);
    }
}
