package lambda_examples.higher_order_function;

public class Operator {
    //Функция высшего порядка
    public void call(OperatorAction operatorAction){
        operatorAction.action();
    }
}
