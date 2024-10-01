package stream_api;

import java.util.List;

public class TerminalOperations {
    public static void main(String[] args) {
        //Терминальная операция - это операция, которая закрывает stream, то есть не позволяет дальше работать
        //с экземпляром stream. Смысл терминальной операции в том, чтобы показать результат работы stream
        //в определённом виде

        //count - возвращает количество элементов
        List<String> numbers = List.of("Видеокарта", "Монитор", "Процессор", "Клавиатура", "наушники");
        System.out.println("Количество элементов: " + numbers.stream().count());

        //forEach - действие с каждым элементом
        System.out.println("Печатаем элементы");
        numbers.stream().forEach(e -> System.out.println(e));
        System.out.println();

    }
}
