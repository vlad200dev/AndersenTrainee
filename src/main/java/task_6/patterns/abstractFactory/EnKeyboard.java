package task_6.patterns.abstractFactory;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println(" type smth");
    }

    @Override
    public void println() {
        System.out.println("print smth out");
    }
}
