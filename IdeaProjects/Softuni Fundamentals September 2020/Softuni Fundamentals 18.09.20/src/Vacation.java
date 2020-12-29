import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        switch (typeOfGroup) {
            case "Students":
                switch (day) {
                    case "Friday":
                        totalPrice = people * 8.45;
                        break;
                    case "Saturday":
                        totalPrice = people * 9.8;
                        break;
                    case "Sunday":
                        totalPrice = people * 10.46;
                        break;
                }
                if (people >= 30) {
                    totalPrice *= 0.85;
                    break;
                }
            case "Business":
                switch (day) {
                    case "Friday":
                        totalPrice = people * 10.9;
                        if (people >= 100) {
                            totalPrice -= 10 * 10.9;
                            break;
                        }

                    case "Saturday":
                        totalPrice = people * 15.6;
                        if (people >= 100) {
                            totalPrice -= 10 * 15.6;
                            break;
                        }

                    case "Sunday":
                        totalPrice = people * 16;
                        if (people >= 100) {
                            totalPrice -= 10 * 16;
                            break;
                        }

                    case "Regular":
                        switch (day) {
                            case "Friday":
                                totalPrice = people * 15;
                                break;
                            case "Saturday":
                                totalPrice = people * 20;
                                break;
                            case "Sunday":
                                totalPrice = people * 22.5;
                                break;
                        }
                        if (people >= 10 && people <= 20) {
                            totalPrice *= 0.95;

                }
                System.out.printf("Total price: %.2f", totalPrice);
        }

    }
    }
}



