package task_6.patterns.abstractFactory;

/**
 * Фабрика для реализации на русском устройства и фабрика для реализации на английском устройства
 *
 * Будем возращать фабрику по стране
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {
        // тут клиентский код
        DeviceFactory factory = getFactoryByCountryCode("ru");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard  = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();
        mouse.click();
        keyboard.print();
        touchpad.track(5,5);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang){
        lang = lang.toUpperCase();
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country Code: "+lang);
        }
    }

}
