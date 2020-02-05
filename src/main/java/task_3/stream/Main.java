package task_3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Метод map()
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //  int[] arrayNew = Arrays.stream(array).map(x -> x * 2).toArray(); или на новый массив
        array = Arrays.stream(array).map(x -> x * 2).toArray();
        System.out.println(Arrays.toString(array)); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list); //[5, 6, 7, 8]
        list = list.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(list); //[10, 12, 14, 16]

        // присвоим/изменим каждому элементу 3ку
        list = list.stream().map(x -> 3).collect(Collectors.toList());
        System.out.println(list); // [3, 3, 3, 3]
    }
}
