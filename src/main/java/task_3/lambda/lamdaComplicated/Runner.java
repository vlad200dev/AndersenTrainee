package task_3.lambda.lamdaComplicated;

public class Runner {
    public void run(Executable executable) {
        int x = 2;
        String result = executable.execute(x);
        System.out.println(result);
    }


    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public String execute(int number) {
                int value = 5; // легко можно создать, так как своя область видимости
                return String.valueOf(number+value);
            }
        });
        final int value = 4;
        runner.run(x -> {
     //       int value = 5; нет своей области видимости метода.
            int y = x + value; // можем создать так как такой переменной нет в области видимости метода main(String[] args) и она финализирована
            return String.valueOf(y);
        });

    }
}
