package lambda_examples.higher_order_function;

public class highOrderFunction {
    public static void main(String[] args) {
        //Функция высшего порядка - это такая функция, которая в качестве аргумента принимает другую функциую
        //и вызывает ее внутри свеого тела
        //пример:Звонок оператора колл центра - функция высшего порядка
        //продажа услуг связи, соц.опрос, Продажа кредитной карты - функция низшего порядка

        Operator operator = new Operator();
        OperatorAction phoneChangeAction = () -> System.out.println("Хотите поменять тариф?");
        OperatorAction socialAction = () -> System.out.println("Из какого вы города?");
        OperatorAction creditCardAction = () -> System.out.println("Не желаете приобрести кредитную карту?");

        operator.call(phoneChangeAction);
        operator.call(socialAction);
        operator.call(creditCardAction);
    }
}
