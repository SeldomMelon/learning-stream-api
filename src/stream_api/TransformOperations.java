package stream_api;

import java.util.List;

public class TransformOperations {
    public static void main(String[] args) {
        //Преобразующие промежуточные операции - нужны для преобразования элементов внутри стрима.
        //Не уменьшают количество стрима

        Student petr = new Student(23, "petr");
        Student vasily = new Student(19, "vasily");
        Student bob = new Student(21, "bob");

        List<Student> students = List.of(petr, vasily, bob);

        //map преобразует элемент в другой тип
        //получаем и печатаем возраст каждого студента
        students.stream()
                .map(student -> student.getAge())
                .forEach(s -> System.out.println(s));

        //peek действия с элементом не меняя тип
        //поменяем имена студентов
        students.stream()
                .peek(student -> student.setName("Mr." + student.getName()))
                .forEach(s -> System.out.println(s));

        //flatMap объединяет стримы в единый стрим
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> list3 = List.of(7, 8, 9);

        List<List<Integer>> lists = List.of(list1, list2, list3);
        lists.stream()
                .flatMap(e -> e.stream())
                .forEach(s -> System.out.print(s + " "));


    }
}
