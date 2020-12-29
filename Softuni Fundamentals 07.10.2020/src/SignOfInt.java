import java.util.Scanner;

public class SignOfInt {
    public static int check(int number) {
if (number > 0){
    System.out.println("The number " + number + " is positive.");
} else if (number < 0) {
    System.out.printf("The number %d is negative.", number);
}else {
    System.out.printf("The number %d is zero.", number);
}
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        check(Integer.parseInt(scanner.nextLine()));

    }
}
