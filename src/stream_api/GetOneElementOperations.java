package stream_api;

import java.util.List;
import java.util.function.BiFunction;

public class GetOneElementOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 8, 2);
        //Получение первого значения
        System.out.println(numbers.stream().findFirst().orElse(10));

        //Получение максимального значения
        System.out.println(numbers.stream().max((a, b) -> a - b).orElseThrow());

        //Получение минимального значения
        System.out.println(numbers.stream().min((a, b) -> a - b).orElseThrow());

        List<Student> students = List.of(
                new Student(23, "petr"),
                new Student(19, "vasily"),
                new Student(21, "bob")
        );
        //Получение самого старшего студента
        System.out.println(students.stream()
                .max((student1, student2) -> student1.getAge() - student2.getAge())
                .orElseThrow());

        //Получить студента с самым коротким именем
        System.out.println(students.stream()
                .min((student1, student2) -> student1.getName().length() - student2.getName().length())
                .orElseThrow());


    }

}
