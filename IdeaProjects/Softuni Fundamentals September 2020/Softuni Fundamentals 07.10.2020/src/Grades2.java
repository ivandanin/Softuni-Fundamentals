import java.util.Scanner;

public class Grades2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade > 2 && grade <= 2.99){
            System.out.println("Fail");
        } else if (grade > 2.99 && grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade > 3.49 && grade <= 4.49) {
            System.out.println("Good");
        } else if (grade > 4.49 && grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade > 5.49 && grade <= 6.00)
            System.out.println("Excellent");

    }
}
