package task_1.basic_algorythms.sort;

/**
 * Практический алгоритм сортировки. Эффективность O(nlogn)
 */
public class GoodPerformanceSort {

    public static void quickSort(int[] arr, int first, int last) {
        if (arr == null || arr.length == 0 || first >= last) return;
        int i = first;
        int j = last;
        int core = arr[first + (last - first) / 2];

        while (i < j) {
            while ((arr[i] < core) && (i<=j)) {
                i++;
            }
            while ((arr[j] > core) && (j>=i)) {
                j--;
            }
            if (i<=j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        if (first < j) {
            quickSort(arr, first, j);
        }
        if (last > i) {
            quickSort(arr, i, last);
        }
    }

}
