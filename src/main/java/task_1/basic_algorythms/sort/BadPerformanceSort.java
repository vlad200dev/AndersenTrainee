package task_1.basic_algorythms.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Алгоритмы сортировок со неудовлетворительным временем работы O(n^2)
 */
public class BadPerformanceSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 7, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void bubbleSort(int[] arr) {
        // two cycles, at once compare two numbers
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            int min = x;
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[y] < arr[min]) {
                    min = y;
                }
            }
            // после прохождения мы получим итоговое, минимальное значение. С ним делаем перестановку.
            int tmp = arr[min];
            arr[min] = arr[x];
            arr[x] = tmp;
        }
    }

}
