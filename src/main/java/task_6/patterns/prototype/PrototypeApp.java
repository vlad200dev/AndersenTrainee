package task_6.patterns.prototype;

/**
 * Должен уметь генерить сам себя. В Java этот паттерн реализован в интерфейсе Clonable()
 */
public class PrototypeApp {
    public static void main(String[] args) {
        // клиентский код
        Human donor =  new Human("Boris",30); // в качестве донора
        HumanFactory factory = new HumanFactory(donor);
        Human clone = factory.makeCopy();
        Human donor2 = new Human("Vasya",35);
        HumanFactory factory2 = new HumanFactory(donor2);
        Human clone2 = factory2.makeCopy();

    }
}
