package task_6.patterns;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternSingletonTest {


    @Test
    void getInstance() {
        PatternSingleton first = PatternSingleton.getInstance("Hello!");
        PatternSingleton second = PatternSingleton.getInstance("Goodbye!");
        Assert.assertEquals(first,second);
    }

}