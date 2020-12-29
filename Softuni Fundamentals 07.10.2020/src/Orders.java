import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        
        switch (product){
            case "water":
                water(quantity);
                break;
            case "coffee":
                coffee(quantity);
                break;
            case "coke":
                coke(quantity);
                break;
            case "snacks":
                snacks(quantity);
                break;
        }
        
    }
    static void water (double quantity) {
        double water = 1.00;
        double result = water * quantity;
        System.out.printf("%.2f", result);
    }

    static void coffee (double quantity) {
        double coffee = 1.5;
        double result = coffee * quantity;
        System.out.printf("%.2f", result);
    }

    static void coke (double quantity) {
        double coke = 1.4;
        double result = coke * quantity;
        System.out.printf("%.2f", result);
    }

    static void snacks (double quantity) {
        double snacks = 2.0;
        double result = snacks * quantity;
        System.out.printf("%.2f", result);
    }
}
