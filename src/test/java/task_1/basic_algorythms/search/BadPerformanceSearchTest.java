package task_1.basic_algorythms.search;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadPerformanceSearchTest {
    BadPerformanceSearch search;
    int[] array;

    @BeforeEach
    void setUp() {
        search = new BadPerformanceSearch();
        array = new int[] {1, 3, 6, 8, 10, 15, 21, 29};
    }

    @Test
    void linerSearch() {
        int find = 8;
        int index = search.linerSearch(array,find);
        int result = 3;
        Assert.assertEquals(index,result);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Some logic");
        search=null;
    }
}