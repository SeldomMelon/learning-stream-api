package stream_api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingTerminalOperations {
    public static void main(String[] args) {
        //Собирающие функции необходимы для получения сгруппированного результата
        //(в виде одно значения или коллекции)

        List<Integer> numbers = List.of(5, 8, 8, 5, 10, 5);
        
        //reduce собирает все числа в одно
        //ifPresent если значение не null, то распечатай
        numbers.stream().reduce((a, b) -> a + b)
                .ifPresent(e -> System.out.println(e));
        
        //Собрать элементы в лист
        List<Integer> collect = numbers.stream().collect(Collectors.toList());
        System.out.println(collect);

        //Собрать коллекцию в сет, коллекция с уникальными значениями
        Set<Integer> collectSet = numbers.stream().collect(Collectors.toSet());
        System.out.println(collectSet);

        //Собрать элементы в map (количество повторений в листе)
        //5 - 1
        //8 - 2
        //10 - 1
        Map<Integer, Integer> collectMap = numbers.stream()
                .collect(Collectors.toMap(
                        number -> number, number -> 1,
                        (valuePrev, valueCurrent) -> valuePrev+ valueCurrent));
        System.out.println(collectMap);
    }
}
