package stream_api;

import java.util.Comparator;
import java.util.List;

public class SortedOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(57, 10, 155, 40, 32, 16);

        //сортировка элементов
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

        Student petr = new Student(23, "petr");
        Student vasily = new Student(19, "vasily");
        Student bob = new Student(21, "bob");

        List<Student> students = List.of(petr, vasily, bob);



        students.stream()
                .sorted((a,b) -> a.getAge() - b.getAge())
                .forEach(s -> System.out.println(s));
        System.out.println();

        //Вынес компаратор в класс Student
        students.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s));
    }
}
