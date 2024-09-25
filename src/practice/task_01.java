package practice;

import java.util.List;
import java.util.Random;

public class task_01 {
    public static void main(String[] args) {
        List<Integer>integers = List.of(1,2,3,4,5,6,7,8,9);
        Random random = new Random(1);
    }
}
//Задача №1
//Создать клаас пользователей, каждый из которых будет иметь порядковый номер, и список с числами
//сделать конструктор на порядковый номер, геттеры и сеттеры на все поря.
//С помощью stream api:
//-1. Оставить только числа больше 4 из integers
//-2. Убрать дубликаты чисел
//-3. Создать пользователя на каждый элемент стрима, где каждый элемент стрима является порядковым номером
//пользователя (список чисел пустой)
//-4. У каждого пользователя заполнить список чисел: количество чисел в списке определяется порядковым
//номером пользователя. Например: для пользователя с порядковым номером 5 генерируется пять случайных
//чисел используя переменную random(random.nextInt(10))
//-5. Создать единый стрим со всеми числами из списков пользователей
//-6. Умножить числа на 10
//-7. Посчитать сумму всем чисел с помощью reduce
//-8. Вывести на экран
//-9. В случае если integers пустой, то должно выводиться на экран "0"
//Внимание! Все операции должны выполняться одной цепочкой integers.stream.map .....
//никаких переменных не должно появиться
//Ожидаемый результат вывода на экран:
//1120 - из примера, 0 - при пустом листе