package stream_api.optional;

public class CarOptional {
    private Car value;

    private CarOptional(Car value) {
        this.value = value;
    }

    //Исключение на null
    public static CarOptional of (Car value){
        if (value == null){
            throw new RuntimeException("Машина null...");
        }
        return new CarOptional(value);
    }


    //если предполагаем что может быть null
    public static CarOptional ofNullable(Car value){
        return new CarOptional(value);
    }

    //если значение null, вернёт машину по умолчанию
    public Car orElse(Car carDefault){
        if (value == null){
            return carDefault;
        }
        return value;
    }

}

