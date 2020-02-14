package task_6.patterns.abstractFactory;

// классы реализующие этот интерфейс и будут ФАБРИКАМИ для создания экземпляров класса
public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
