package task_1.basic_algorythms.sort;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GoodPerformanceSortTest {
    GoodPerformanceSort sort;
    int[] array;

    @BeforeEach
    void setUp() {
        System.out.println("Начало тестирования");
        sort = new GoodPerformanceSort();
        array = new int[]{3, 5, 6, 2, 7, 1};
    }



    @Test
    void mergeSort() {

    }

    @Test
    @DisplayName("QuickSort algorythm test")
    void quickSort() {
        sort.quickSort(array,0,array.length-1);
        int[] sortedArray ={1,2,3,5,6,7};
        Assert.assertArrayEquals(sortedArray,array);
    }


    @AfterEach
    void tearDown() {
        sort=null;
        System.out.println("Конец тестирования");
    }
}