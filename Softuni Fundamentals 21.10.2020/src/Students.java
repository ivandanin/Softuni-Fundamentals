import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] parameters = input.split(" ");
            Student s = new Student(parameters[0], parameters[1], Integer.parseInt(parameters[2]), parameters[3]);

            students.add(s);
            input = scanner.nextLine();
        }
        String searchTownName = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(searchTownName)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
    static int findStudentIndex (List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName) &&
                    students.get(i).getLastName().equals(lastName)) {
                return i;
            }
        }
        return 0;
    }
}
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
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getHometown() {
        return hometown;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

}
