package stream_api;

import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {
        //Промежуточные операции производят действие с элементами стрима и всегда возвращают объект класса Stream
        //Для использования промежуточной операции нужна терминальная после

        List<Integer> numbers = List.of(5, 10, 15, 20);

        //отсеиваем числа которые больше 10
        numbers.stream()
                .filter(e -> e > 10) //filter возвращает объект класса стрим
                .forEach(number -> System.out.println(number));

    }
}
