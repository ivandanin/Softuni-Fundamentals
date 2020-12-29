import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        int laptop = Integer.parseInt(scanner.nextLine());
        int moneyPerToy = Integer.parseInt(scanner.nextLine());
        int treat = 5;
        int sum = 0;
        int sumForEvenBirthday = 0;
        for (int i = 1; i <= years / 2; i++) {
            sum = 30 * i;
sumForEvenBirthday += sum;
        }
        int totalPerToy = years/2 * moneyPerToy;
        int totalForTreat = years/2 * treat;

        int totalSum = sumForEvenBirthday + totalPerToy - totalForTreat - laptop;


        if (sumForEvenBirthday + totalPerToy - totalForTreat > laptop) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(Math.abs(totalSum));




    }
}
