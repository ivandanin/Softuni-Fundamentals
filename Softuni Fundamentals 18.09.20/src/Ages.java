import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int years = Integer.parseInt(input);

        if (years >=0 && years <=2){
            System.out.print("baby");
        }else if (years > 2 && years <= 13){
            System.out.print("child");
        }else if (years > 13 && years <=19){
            System.out.print("teenager");
        }else if (years > 19 && years <=65){
            System.out.print("adult");
        }else if (years >= 66){
            System.out.print("elder");
        }
    }
}
