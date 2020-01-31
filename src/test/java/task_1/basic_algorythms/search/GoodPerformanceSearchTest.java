package task_1.basic_algorythms.search;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodPerformanceSearchTest {

    GoodPerformanceSearch search;
    int[] array;

    @BeforeEach
    void setUp() {
        search=new GoodPerformanceSearch();
        array = new int[] {1, 3, 6, 8, 10, 15, 21, 29};
    }

    @Test
    @DisplayName("Binary Search test")
    void binarySearch() {
        int key = 8;
        int result = search.binarySearch(array,key,0,array.length-1);
        int compare = 3;
        Assert.assertEquals(result,compare);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Some shutdown logic");
        search=null;
    }
}