import java.io.OutputStream;
import java.util.*;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banned = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        String[] words = text.split("[, .]+");

        for (String ban : banned) {
            if (text.contains(ban)) {
                String replacement = repeatStr("*", ban.length());
                text = text.replace(ban, replacement);
            }
        }
        System.out.println(text);
        }

    private static String repeatStr(String str, int length) {
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += str;
        }
        return replacement;
    }
}