import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String money = scanner.nextLine();
        String product = scanner.nextLine();
        double sum = Double.parseDouble(money);

        double nuts = 2;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1;

            while (!"START".equals(money)) {
        sum ++;
                try {
                    if (sum == 0.1 || sum == 0.2 || sum == 0.5 || sum == 1 || sum == 2);
                }catch (Exception e){
                    System.out.printf("Cannot accept %s", money);
                }
            }





    }
}
