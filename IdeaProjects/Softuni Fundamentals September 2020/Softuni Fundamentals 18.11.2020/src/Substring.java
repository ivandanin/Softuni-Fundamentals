import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removable = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(removable);

        while (index != -1) {
            text = text.replace(removable, "");
            index = text.indexOf(removable);
        }

        System.out.println(text);
    }
}

