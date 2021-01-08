import java.util.Scanner;

public class PalindromeInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        while (!input.toString().equals("END")) {

            if (!(Integer.parseInt(input.toString()) == Integer.parseInt(input.reverse().toString()))) {
                System.out.println("false");
            } else if (Integer.parseInt(input.toString()) == Integer.parseInt(input.reverse().toString())){
                System.out.println("true");
            }

            input = new StringBuilder(scanner.nextLine());
        }
    }
}
