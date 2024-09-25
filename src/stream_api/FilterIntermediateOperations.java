package stream_api;

import java.util.List;

public class FilterIntermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 8, 8, 5, 10, 5);

        //фильтрация элементов по условию (все числа которые равны 5)
        System.out.println("Только те элементы, которые равны 5");
        numbers.stream().filter(e -> e == 5).forEach(s -> System.out.print(s + " "));

        //удаляем дубликаты из списка
        System.out.println("\n Удаляем все дубликаты"); // \n переносит строку
        numbers.stream().distinct().forEach(s -> System.out.print(s + " "));

        //убираем/пропускаем первые n элементов
        System.out.println("\n Пропускаем первые 2 элемента из списка");
        numbers.stream().skip(2).forEach(s -> System.out.print(s + " "));

        //оставляем первые n элементов
        System.out.println("\n Оставляем только первые 2 элемента");
        numbers.stream().limit(2).forEach(s -> System.out.print(s + " "));
    }
}
