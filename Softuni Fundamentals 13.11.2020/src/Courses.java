import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> course = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String courseName = tokens[0] && tokens[1];
            //String splitter = tokens[1] = ":";
            String name = tokens[2];


            if (course.putIfAbsent(courseName, name);

            input = scanner.nextLine();
        }
    }
}
