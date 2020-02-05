package task_3.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
method chaining
 */
public class Main5 {
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

        // задача: Оставить в массиве только нечетные числа и каждое из них умножить на 2
        // вызвать метод filter()
        // вызвать метод map()
        int[] arrayChanged = Arrays.stream(array).filter(x -> x % 2 != 0).map(x -> x * 2).toArray();
        System.out.println(Arrays.toString(arrayChanged)); // [2, 6, 10, 14, 18]

        // проверка что на других типах коллекций сработает
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println(set); //[4, 5, 6, 7, 8, 9, 10]
        set = set.stream().map(x -> x * 2).collect(Collectors.toSet());
        System.out.println(set); //[16, 18, 20, 8, 10, 12, 14]
    }
}
