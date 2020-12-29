import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int hours = 0; hours < 23; hours++) {
            hours = Integer.parseInt(scanner.nextLine());
            for (int mins = 0; mins < 59; mins++) {
                mins = Integer.parseInt(scanner.nextLine());
                mins += 30;
                if (mins > 59) {
                    mins -= 60;
                    hours +=1;

                }if (hours > 23) {
                    hours = hours - 24;
                    }

                System.out.printf("%d:%02d",hours,mins);

            }

        }
    }
}
