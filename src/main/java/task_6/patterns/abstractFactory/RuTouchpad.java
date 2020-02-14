package task_6.patterns.abstractFactory;

public class RuTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("ткнуть пальцем....");
    }
}
