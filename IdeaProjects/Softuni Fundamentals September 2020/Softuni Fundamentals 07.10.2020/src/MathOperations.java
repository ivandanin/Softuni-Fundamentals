import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculations(firstNum, operator, secondNum));
    }

    static double calculations (double first, String operator, double second) {
        double result = 0.0;

        switch (operator){
            case "+":
               return result = first + second;
            case "-":
               return result = first - second;
            case "*":
               return result = first * second;
            case "/":
                result = first / second;
        }
        return result;

    }
}

