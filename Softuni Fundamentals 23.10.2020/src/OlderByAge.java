import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OlderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, ID, age);

            personList.add(person);
            input = scanner.nextLine();
        }
        personList.stream().sorted(Comparator.comparingInt(Person::getAge)).
                forEach(person -> System.out.println(person.toString()));

    }
    static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.ID = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", getName(), getID(), getAge());
        }
    }
}
