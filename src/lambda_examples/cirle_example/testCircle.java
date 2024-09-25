package lambda_examples.cirle_example;

import java.util.List;

public class testCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle("purple");
        Circle circle2 = new Circle("purple");
        Circle circle3 = new Circle("purple");

        List<Circle> circles = List.of(circle1, circle2, circle3);

        //Вариант с циклом
//        for (Circle circle : circles) {
//            circle.setColor("yellow");
//        }
//        System.out.println(circles);

        //Вариант через Stream
        circles.stream().forEach(e -> e.setColor("yellow"));
        System.out.println(circles);
    }
}
