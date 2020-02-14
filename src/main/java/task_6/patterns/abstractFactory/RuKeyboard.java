package task_6.patterns.abstractFactory;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("напечатать что-то");
    }

    @Override
    public void println() {
        System.out.println("вывести что-то");
    }
}
