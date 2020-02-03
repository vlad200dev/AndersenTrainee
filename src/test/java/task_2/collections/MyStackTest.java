package task_2.collections;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackTest {
    MyStack stack;

    @BeforeEach
    void setUp() {
        stack = new MyStack();
    }

    @Test
    void push() {
        boolean result = stack.push(5);
        Assert.assertTrue(result);
    }

    @Test
    void push2() {
        boolean result = stack.push(5);
        boolean result2 = stack.push(5);
        Assert.assertTrue(result2);
    }

    @Test
    void isEmpty() {
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    void peek() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int result = stack.peek();
        int expected = 4;
        Assert.assertEquals(expected,result);
    }

    @Test
    void peek2() {
        stack.push(1);
        int result = stack.peek();
        int expected = 1;
        Assert.assertEquals(expected,result);
    }

}