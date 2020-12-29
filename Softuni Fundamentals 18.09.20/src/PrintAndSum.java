import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = one; i <= two ; i++) {
            System.out.printf("%d ",i);
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: "+ sum);

            
        }
        }

