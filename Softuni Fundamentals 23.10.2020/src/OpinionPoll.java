import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();



        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);

            personList.add(person);
        }

            personList.stream().filter(person -> person.getAge() > 30).sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
                    .forEach(person -> System.out.println(person.toString()));
            }

        }

    class Person  {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


        @Override
        public String toString() {
            return String.format("%s - %d", getName(), getAge());
        }
    }

