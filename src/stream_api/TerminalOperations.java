package stream_api;

import java.util.List;

public class TerminalOperations {
    public static void main(String[] args) {
        //Терминальная операция - это операция, которая закрывает stream, то есть не позволяет дальше работать
        //с экземпляром stream. Смысл терминальной операции в том, чтобы показать результат работы stream
        //в определённом виде

        //count - возвращает количество элементов
        List<Integer> numbers = List.of(1, 2, 3);
        System.out.println("Количество элементов: " + numbers.stream().count());

        //forEach - действие с каждым элементом
        System.out.println("Печатаем элементы");
        numbers.stream().forEach(e -> System.out.println(e));
        System.out.println();

    }
}
