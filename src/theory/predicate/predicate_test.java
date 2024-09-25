package theory.predicate;

import java.util.function.Predicate;

public class predicate_test {
    public static void main(String[] args) {
        //Predicate - функция, которая принимает один аргумент и возвращает true/false
        //пример: проверка возраста в магазине

        Predicate<Integer> isAdult = (age) -> age > 17;
        boolean result = isAdult.test(26);
        System.out.println(result);
    }
}
