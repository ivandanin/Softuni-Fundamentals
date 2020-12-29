import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArraysString = scanner.nextLine();
        String[] firstNumbersString = firstArraysString.split(" ");
        int [] firstArray = new int [firstNumbersString.length];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstNumbersString[i]);
        }
        String secondArraysString = scanner.nextLine();
        String[] secondNumbersString = secondArraysString.split(" ");
        int [] secondArray = new int [firstNumbersString.length];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondNumbersString[i]);
        }
        boolean areEquals = true;
        int diff = -1;
        if (firstArray.length == secondArray.length) {
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                areEquals = false;
                diff = i;
                break;
            }
        }
        } else {
            areEquals = false;
        }
        if (areEquals) {
            int sum = 0;
            for (int number : firstArray){
                sum += number;
            }
            System.out.println("Arrays are identical.");
        }else {
            System.out.println("Arrays are not identical. Found difference at " + diff + " index.");
        }
    }
}
