import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double V = length * width * height / 3;

        System.out.printf("Length: ");
        System.out.printf("Width: ");
        System.out.printf("Height: ");

        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
