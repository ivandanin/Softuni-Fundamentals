import java.util.Scanner;

public class RepeatString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text, count));

    }

    static String repeatString (String text, int count) {
        String result = text;

        for (int i = 1; i < count ; i++) {
            System.out.print(result);
        }
        return result;
    }
}
