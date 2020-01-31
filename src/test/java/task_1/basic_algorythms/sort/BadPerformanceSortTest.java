package task_1.basic_algorythms.sort;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Tests for class BadPerformanceSort")
class BadPerformanceSortTest {
        BadPerformanceSort sort;
        int[] array;

    @BeforeEach
    void setUp() {
        System.out.println("Начало тестирования");
        sort = new BadPerformanceSort();
        array = new int[]{3, 5, 6, 2, 7, 1};
    }

    @Test
    @DisplayName("First basic algorythm")
    public void bubbleSort() {
        sort.bubbleSort(array);
        int[] sortedArray = {7, 6, 5, 3, 2, 1};
        Assert.assertArrayEquals(sortedArray,array);
    }


    @Test
    @DisplayName("Second basic algorythm")
    void selectionSort() {
        sort.selectionSort(array);
        int[] sortedArray = {1, 2, 3, 5, 6, 7};
        Assert.assertArrayEquals(sortedArray,array);
    }

    @AfterEach
    void tearDown() {
        sort=null;
        System.out.println("Конец тестирования");
    }
}