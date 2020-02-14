package task_6.patterns.abstractFactory;
// Фабрика для создания первого семейства объектов для рускоязычной  (по факту мы реализуем в этотм примере 3 паттерна фабричных метода за раз)
public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
