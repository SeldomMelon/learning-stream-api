package theory.function;

import java.util.function.Function;

public class function_test {
    public static void main(String[] args) {
        //Function - функция, которая принимает один аргумент и возвращает указанный тип данных
        //пример: Автомат по продаже напитков

        Function<Integer, String> automate = (money) -> {
            if (money == 100){
                return "Coca-Cola";
            } else if (money == 50) {
                return "Water";
            }else {
                return "Nothing";
            }
        };
        System.out.println(automate.apply(100));
    }
}
