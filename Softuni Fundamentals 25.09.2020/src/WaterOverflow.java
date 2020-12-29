import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalLitters = 0;
        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (totalLitters + litters > 255) {
                System.out.println("Insufficient capacity!");
            } else totalLitters += litters;
        }
        System.out.println(totalLitters);
    }

}
