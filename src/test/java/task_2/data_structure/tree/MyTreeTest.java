package task_2.data_structure.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTreeTest {

    @Test
    void find() {
        MyTree tree = new MyTree();
        tree.add(55,1);
        tree.add(45,5);
        tree.add(55,3);
        int result = tree.find(5);
        int expected = 45;
        Assert.assertEquals(expected,result);
    }

    @Test
    void add() {
        MyTree tree = new MyTree();
        boolean result = tree.add(55,1);
        Assert.assertTrue(result);
    }

    @Test
    void findMinimum() {
        MyTree tree = new MyTree();
        tree.add(55,8);
        tree.add(45,5);
        tree.add(18,3);
        int result = tree.findMinimum();
        int expected = 18;
        Assert.assertEquals(expected,result);
    }
}