package task_3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * метод reduce()
 *
 */
public class Main4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        List<Integer> list = new ArrayList<>(5);
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(8);
        list.add(12);
        list.add(7);
        list.add(3);
        list.add(13);
        System.out.println(list); //[5, 6, 10, 8, 12, 7, 3, 13]


        int sum = Arrays.stream(array).reduce((tmp, x) -> tmp + x).getAsInt(); // суммирование
        int multiply = list.stream().reduce((tmp, x) -> tmp * x).get(); // произведение

        System.out.println(sum); // 55
        System.out.println(multiply); // 7862400

    }
}
