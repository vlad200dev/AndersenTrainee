package task_3.lambda.exercise;


public class Main {
    public static void main(String[] args) {
        SortStrings sortStrings = new SortStrings();
        sortStrings.getList().add("Mickael Jackson");
        sortStrings.getList().add("Sting");
        sortStrings.getList().add("Evanescence");
        sortStrings.getList().add("Linking Park");


        sortStrings.getList().sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(sortStrings.getList());

    }
}
