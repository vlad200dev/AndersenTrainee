package task_6.patterns.abstractFactory;

public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("click smth");
    }

    @Override
    public void dbclick() {
        System.out.println("dbclick smth");
    }

    @Override
    public void scroll(int direction) {
        System.out.println("scroll smth");
    }
}
