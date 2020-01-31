package task_1.datastructure;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new MyLinkedList();
    }

    @Test
    @DisplayName("testing add method")
    void add() {
        boolean result = myLinkedList.add(5);
        Assert.assertTrue(result);
    }

    @Test
    void testToString() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        String result = myLinkedList.toString();
        int[] arr = {1,2,3};
        String expected = Arrays.toString(arr);
        Assert.assertEquals(expected,result);
    }

    @Test
    void get() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        int result = myLinkedList.get(1);
        int expected = 2;
        Assert.assertEquals(expected,result);
    }

    @Test
    void delete() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        boolean result = myLinkedList.delete(1);
        Assert.assertTrue(result);
    }

    @Test
    void delete2() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        boolean result = myLinkedList.delete(0);
        Assert.assertTrue(result);
    }

    @Test
    void size() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        int result = myLinkedList.size();
        int expected = 3;
        Assert.assertEquals(expected,result);
    }
}