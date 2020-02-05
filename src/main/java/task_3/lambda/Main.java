package task_3.lambda;

// способы реализации функционального интерфейса
public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutImplm()); //  через отдельный класс

        runner.run(new Executable() { // через анонимный класс
            @Override
            public void execute() {
                System.out.println("some logic");
            }
        });

        runner.run(()-> System.out.println("some logic"));
    }
}
