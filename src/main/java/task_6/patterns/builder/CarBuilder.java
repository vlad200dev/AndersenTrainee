package task_6.patterns.builder;

// Класс СТРОИТЕЛЬ
public class CarBuilder {
    // обязательны дефолтные значения
   private String tp = "Default";
   private Transmission tr = Transmission.AUTO;
   private int sp = 120;

    CarBuilder builderType(String tp) {
        this.tp = tp;
        return this;
    }

    CarBuilder buildTransmission(Transmission transmission) {
        this.tr = transmission;
        return this;
    }

    CarBuilder buildMaxSpeed(int speed) {
        this.sp = speed;
        return this;
    }

    // метод который будет непосредственно возвращать готовую машину с готовым набором значений.
    Car build() {
        Car car = new Car();
        car.setMake(tp);
        car.setTransmission(tr);
        car.setMaxSpeed(sp); // передаем готовые параметры
        return car; // машина готова
    }

}
