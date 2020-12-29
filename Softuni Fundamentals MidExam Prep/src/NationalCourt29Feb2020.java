import java.util.Scanner;

public class NationalCourt29Feb2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeA = Integer.parseInt(scanner.nextLine());
        int employeeB = Integer.parseInt(scanner.nextLine());
        int employeeC = Integer.parseInt(scanner.nextLine());

        int totalPeople = Integer.parseInt(scanner.nextLine());

        int totalCapacityPerHour = employeeA + employeeB + employeeC;

        int time = 0;

        while (totalPeople > 0) {
            totalPeople -= totalCapacityPerHour;
            time ++;

            if(time % 4 == 0){
                time ++;
            }
            if (totalPeople <= 0){
                break;
            }
        }
        System.out.printf("Time needed: %dh.", time);

    }
}
