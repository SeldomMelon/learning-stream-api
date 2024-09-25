package practice;

import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<String> strings = List.of("Яблоко", "Банан", "Апельсин", "Яблоко", "Мандарин", "Банан");
        List<Integer> numbers = List.of(11,22,33,44,55);



        System.out.println(strings.stream().distinct().collect(Collectors.toList()));
        System.out.println(strings.stream().filter(e->e.equals("Яблоко")).count());
        System.out.println(numbers.stream().reduce((a,b)-> a + b).orElse(0));

    }
}
