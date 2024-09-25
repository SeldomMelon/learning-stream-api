package stream_api.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //Класс Optional позволяет производить проверку на null возвращаемого значения. В случае обнаружения null
        //предоставляет набор методов для обработки: от выкидывания ошибки до замены на значение по умолчанию

        Car audi = new Car("Audi");
        Car bmw = new Car("BMW");

        Car[] garage = new Car[2];
        garage[0] = audi;
        garage[1] = bmw;

        garage[0] = null;
        Car firstCar = garage[0];
        //CarOptional carOptional = CarOptional.ofNullable(firstCar); //своя реализация Optional
        Optional<Car> carOptional = Optional.ofNullable(firstCar); //основной класс Optional

        System.out.println(Arrays.toString(garage));
        printCars(carOptional.orElse(new Car("Велосипед")));

    }

    public static void printCars(Car car){
        System.out.println(car.getBrand());
    }
}
