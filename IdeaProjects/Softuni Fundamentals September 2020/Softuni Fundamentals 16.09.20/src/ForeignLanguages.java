import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        if (country.equals("England")|| country.equals("USA")) {
            System.out.print("English");
        } else if (country.equals("Spain")|| country.equals("Argentina") || country.equals("Mexico")){
            System.out.print("Spanish");
        }else {
            System.out.print("unknown");
        }
    }
}
