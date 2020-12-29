import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();


        switch (dataType) {
            case "string":
               String firstData = scanner.nextLine();
               String secondData = scanner.nextLine();
                System.out.println(getMax(firstData, secondData));
                break;
            case "char":
                char a = scanner.nextLine().charAt(0);
                char b = scanner.nextLine().charAt(0);
                System.out.println(getMax(a, b));
                break;
            case "int":
                int one = Integer.parseInt(scanner.nextLine());
                int two = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(one, two));
                break;

        }

    }

    static int getMax (int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }
    static char getMax (char first, char second) {
        if (first > second){
            return first;
        }
        return second;
    }

    static String getMax (String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
