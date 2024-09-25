package lambda_examples.cirle_example;

public class Circle {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    //Красим круг
    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                '}';
    }
}
