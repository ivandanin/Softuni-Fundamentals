import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            char firstChar = (char) ('a' + i);
            char secChar = (char) ('b' + i);
            char thirdChar = (char) ('c' + i);
            System.out.print(firstChar + secChar +thirdChar );
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    String ch = String.valueOf(n);


                }

            }
        }

    }
}
