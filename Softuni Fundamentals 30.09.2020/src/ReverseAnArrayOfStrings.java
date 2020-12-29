import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String element = scanner.nextLine();
        String[] array = new String[Integer.parseInt(element)];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < array.length / 2; i++) {
            int swap = array.length - i - 1;
            String first = array[i];
            array[i] = array[swap];
            array[swap] = first;
        }
        for (String s : array) {
            System.out.println(s + " ");
        }
    }
}
