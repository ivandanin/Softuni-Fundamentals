import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        int day = scanner.nextInt();
        if (1 <= day && day <= 7) {
            System.out.println(daysOfWeek[day - 1]);
        } else {

            System.out.println("Invalid day!");
        }
    }
}
