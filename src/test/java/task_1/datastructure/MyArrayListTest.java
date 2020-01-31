package task_1.datastructure;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task_1.StillNotReadyCoreException;
import org.junit.*;

import java.util.Random;

import static org.junit.Assert.fail;

class MyArrayListTest {
        MyArrayList myArrayList;

    @BeforeEach
    void setUp() {
        System.out.println("Start testing");
        myArrayList = new MyArrayList();
    }

    @Test
    @DisplayName("testing adding")
    void add() {
        try {
            Assert.assertTrue(myArrayList.add(3));
        } catch (StillNotReadyCoreException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("test for out of bound exception")
    void add2() {
            for (int x=0;x<15;x++){
                try {
                    myArrayList.add(x);
                } catch (StillNotReadyCoreException |ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
    }

    @Test
    @DisplayName("testing deleting from list")
    void delete() {
        try {
            myArrayList.add(55);
        } catch (StillNotReadyCoreException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(myArrayList.delete(55));
    }

    @Test
    @DisplayName("testing getting from list")
    void indexOf() throws StillNotReadyCoreException {
        myArrayList.add(9);
        myArrayList.add(7);
        myArrayList.add(5);
        myArrayList.add(3);
        int result = myArrayList.indexOf(2);
        int expected = 5;
        Assert.assertEquals(5,result);
    }

    @Test
    @DisplayName("testing getting from list if out of bound exception")
    void indexOf2() {
        try {
            myArrayList.add(9);
            myArrayList.add(7);
            myArrayList.add(5);
            myArrayList.add(3);
            int result = myArrayList.indexOf(5);
            fail("test failed");
        } catch (ArrayIndexOutOfBoundsException | StillNotReadyCoreException exc){
        }
    }

    @Test
    @DisplayName("testing updating info")
    void update() throws StillNotReadyCoreException {
        myArrayList.add(9);
        myArrayList.add(7);
        myArrayList.add(5);
        boolean result = myArrayList.update(1,17);
        Assert.assertTrue(result);
    }

    @Test
    @DisplayName("testing the count info")
    void size() throws StillNotReadyCoreException {
        myArrayList.add(9);
        myArrayList.add(7);
        myArrayList.add(5);
        int size = myArrayList.size();
        int expected = 3;
        Assert.assertEquals(3,size);
    }

}