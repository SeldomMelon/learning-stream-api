package practice.tasks_with_classes;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brain = new Trader("Brain", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brain, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(alan, 2012, 710),
                new Transaction(alan, 2012, 600),
                new Transaction(mario, 2012, 950)
        );
        //1. Найти все транзакции за 2011 год и отсортировать их по сумму (от меньшей к большей)
        List<Transaction> collect = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("Задача №1: " + collect);

        //2. Вывести список неповторяющихся городов, в которых работают трейдеры
        List<String> collectCity = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Задача №2: " + collectCity);

        //3. Найти всех трейдеров из Кембриджа и отсортировать их по имени
        List<Trader> cambridge = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println("Задача №3: " + cambridge);

        //4. Вернуть строку со всеми именами трейдеров и отсортировать их в алфавитном порядке
        String reduce = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(a, b) -> a + b);
        System.out.println("Задача №4: " + reduce);

        //5. Выяснить существует ли хоть один трейдер из Милана
        boolean milan = transactions.stream()
                .anyMatch(trader -> trader.getTrader().getCity().equals("Milan"));
        System.out.println("Задача №5: " + milan);

        //6. Вывести суммы всех транзакций трейдеров из Кембриджа
        List<Integer> cambridge1 = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getValue())
                .collect(Collectors.toList());
        System.out.println("Задача №6: " + cambridge1);

        //7. Какова максимальная сумма среди всех транзакций
        Optional<Integer> reduce1 = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::max);
        System.out.println(reduce1);

    }
}
