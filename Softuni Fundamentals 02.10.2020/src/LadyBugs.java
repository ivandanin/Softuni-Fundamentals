import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] field = new int[n];

        String[] bugsIndexes = scanner.nextLine().split(" ");

        for (int i = 0; i < bugsIndexes.length; i++) {
            field[i] = 1;
        }
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] command = scanner.nextLine().split(" ");
            int bugIndex = Integer.parseInt(command[0]);
            String direction = command[1];
            int flightLength = Integer.parseInt(command[2]);

            if (bugIndex <= 0 || bugIndex >= field.length || field[bugIndex] != 1) {
                line = scanner.nextLine();
                continue;
            }
            if (direction.equals("right")) {
                field[bugIndex] = 0;
                while (field[bugIndex + flightLength] < field.length && field[bugIndex + flightLength] != 1) {
                    field[bugIndex + flightLength] = 1;
                }
            } else {
                field[bugIndex] = 0;
                while (field[bugIndex - flightLength] > 0 && field[bugIndex - flightLength] != 1) {
                    field[bugIndex - flightLength] = 1;
                }
                line = scanner.nextLine();

            }
            for (int i = 0; i < field.length; i++) {
                System.out.print(field[i] + " ");

            }
        }
    }
}