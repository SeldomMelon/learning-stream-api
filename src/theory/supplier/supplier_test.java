package theory.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class supplier_test {
    public static void main(String[] args) {
        //Supplier - функция, которая не принимает аргумент и возвращает указанный тип данных
        //пример: Терминал получения талона в очереди

        Supplier<Integer> talons = () -> new Random().nextInt(100);
        System.out.println("Номер в очереди: " + talons.get());
    }
}
