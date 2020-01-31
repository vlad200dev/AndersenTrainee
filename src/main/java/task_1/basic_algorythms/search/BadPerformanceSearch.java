package task_1.basic_algorythms.search;

public class BadPerformanceSearch {

    public int linerSearch(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return index;
    }
}
