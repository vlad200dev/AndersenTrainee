package task_6.patterns.abstractFactory;

public class EnTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("track the finger to smth");
    }
}
