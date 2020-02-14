package task_6.patterns.abstractFactory;

public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Щелкать мышкой");
    }

    @Override
    public void dbclick() {
        System.out.println("Кликнуть мышкой");
    }

    @Override
    public void scroll(int direction) {
        System.out.println("довести мышку до");
    }
}
