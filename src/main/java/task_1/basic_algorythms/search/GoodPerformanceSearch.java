package task_1.basic_algorythms.search;

public class GoodPerformanceSearch {

    public int binarySearch(int[] arr, int key, int first, int last) {
        int index = -1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (arr[middle] == key) {
                return middle;
            }
            if (key < arr[middle]) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return index;
    }

}
