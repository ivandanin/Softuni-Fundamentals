import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlourPerPackage = Double.parseDouble(scanner.nextLine());
        double priceOfEggPerPackage = Double.parseDouble(scanner.nextLine());
        double priceOfApronPerPerson = Double.parseDouble(scanner.nextLine());

        double totalForFlour;
        if (students % 5 == 0) {
            totalForFlour = priceOfFlourPerPackage * students - (int) ((priceOfFlourPerPackage * students) - priceOfFlourPerPackage * (students - (students / 5)));
        }
        else {
            totalForFlour = priceOfFlourPerPackage * students;
        }
        double totalForEggs = priceOfEggPerPackage * 10 * students;
        double totalForAprons = priceOfApronPerPerson * Math.ceil(students + students* 0.2);

        double totalMoneyNeeded = totalForFlour + totalForEggs + totalForAprons;

        if (totalMoneyNeeded >= budget) {
            System.out.printf("%.2f$ more needed.", Math.abs(budget - totalMoneyNeeded));
        } else {
            System.out.printf("Items purchased for %.2f$.", totalMoneyNeeded);
        }
    }
}
