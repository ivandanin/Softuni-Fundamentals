import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

        Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;

            
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {


            input = scanner.nextLine();
        }

    }
}
