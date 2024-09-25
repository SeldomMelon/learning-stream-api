package stream_api;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //Создание стрима из массива
        int[] numbers = {1, 2, 3};
        IntStream stream = Arrays.stream(numbers);
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        //Создание стрима из коллекции
        List<Integer> integers = List.of(4, 5, 6);
        Stream<Integer> integerStream = integers.stream();
        integerStream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        ///Создание стрима из элементов
        Stream<Integer> elementStream = Stream.of(7, 8, 9);
        elementStream.forEach(e -> System.out.print(e + " "));
    }
}
