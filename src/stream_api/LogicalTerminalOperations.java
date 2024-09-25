package stream_api;

import java.util.List;

public class LogicalTerminalOperations {
    public static void main(String[] args) {
        //Логические терминальные операции - созданы для проверки на условие всех элементов,
        //возвращающих всего булево значение

        List<Integer> numbers = List.of(4, 8, 2);
        System.out.println("Наши числа из списка" + numbers);

        //anyMatch - любой элемент совпадает c 4 - true / любой элемент больше 10 - false
        boolean anyMatchExample1 = numbers.stream().anyMatch(e -> e == 4);
        System.out.println("Хотя бы один элемент совпадает со значением 4: " + anyMatchExample1);

        boolean anyMatchExample2 = numbers.stream().anyMatch(e -> e > 10);
        System.out.println("Любой элемент больше 10: " + anyMatchExample2);
        System.out.println();

        //allMatch - все элементы совпадают c 8 - false / все элементы меньше 10 - true
        boolean allMatchExample1 = numbers.stream().allMatch(e -> e == 8);
        System.out.println("Все элементы совпадают со значением 8: " + allMatchExample1);

        boolean allMatchExample2 = numbers.stream().allMatch(e -> e < 10);
        System.out.println("Все элементы меньше 10: " + allMatchExample2);
        System.out.println();

        //noneMatch - ни один элемент не совпадает c 2 - false / ни один элемент, не больше 10 - true
        boolean noneMatchExample1 = numbers.stream().noneMatch(e -> e == 2);
        System.out.println("Ни один элемент не совпадает со значением 2: " + noneMatchExample1);

        boolean noneMatchExample2 = numbers.stream().noneMatch(e -> e > 10);
        System.out.println("Ни один элемент, не больше 10: " + noneMatchExample2);

    }
}
