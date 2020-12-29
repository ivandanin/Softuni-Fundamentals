import java.util.Scanner;

public class BonusScoringSystem29Feb2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendances = 0;

        for (int i = 0; i < countOfStudents; i++) {
           int studentAttendances = Integer.parseInt(scanner.nextLine());
           double totalBonus = studentAttendances * 1.0 / countOfLectures * (5 + additionalBonus);

           if (totalBonus > maxBonus) {
               maxBonus = totalBonus;
               maxAttendances = studentAttendances;
           }

        }


        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
