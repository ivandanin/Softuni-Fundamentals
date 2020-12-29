import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

            repeat(text, count);

    }

    static void repeat (String text, int count) {
        String repeat = text.repeat(count);
        System.out.print(repeat);
    }
}
