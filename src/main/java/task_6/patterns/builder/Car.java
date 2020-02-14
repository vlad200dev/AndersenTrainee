package task_6.patterns.builder;

public class Car {
    String type;
    Transmission transmission;
    int maxSpeed;

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMake(String make){
        this.type = make;

    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
