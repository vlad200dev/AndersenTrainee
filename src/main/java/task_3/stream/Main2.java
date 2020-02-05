package task_3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * метод filter()
 */
public class Main2 {
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
        System.out.println(list);

        // filter() метод для фильтрации данных (если нужно какое-то подмножество элементов из общего множества). Возвращает true/false
        // задача, оставить только те числа, которые делятся на 2
        array = Arrays.stream(array).filter(x -> x % 2 == 0).toArray();
        System.out.println(Arrays.toString(array)); // [2, 4, 6, 8, 10]
        list = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(list); // [6, 10, 8, 12]
    }
}
