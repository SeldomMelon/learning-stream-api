package theory.consumer;

import java.util.function.Consumer;

public class consumer_test {
    public static void main(String[] args) {
        //Consumer - функция, которая принимает один аргумент и ничего не возвращает (может делать какое-то действие)
        //пример: Костёр

        Consumer<String> fire = (item) -> {
            if (item.equals("Дрова")){
                System.out.println("Огонь горит долго");
            }else if (item.equals("Бумага")){
                System.out.println("Огонь горит ярко");
            }
        };
        fire.accept("Дрова");
    }
}
