package task_6.patterns.builder;

/**
 * Строитель концентрируется на посторойке сложных объектов
 */
public class BuilerApp {
    public static void main(String[] args) {
        // клиентский код
        Car car = new CarBuilder()
                .builderType("Mersedes")
       //         .buildTransmission(Transmission.AUTO) можем закомитить и всеравно машина соберется
                .buildMaxSpeed(250)
                .build();
        System.out.println(car);
    }
}
