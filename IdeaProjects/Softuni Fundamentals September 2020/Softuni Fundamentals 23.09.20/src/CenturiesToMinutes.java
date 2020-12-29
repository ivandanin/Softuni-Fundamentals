import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        int years = 100 * centuries;
        int days = (int) (365.2422 * years);
        int hours =days * 24;
        int mins = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes ",centuries, years, days, hours, mins);
    }
}
