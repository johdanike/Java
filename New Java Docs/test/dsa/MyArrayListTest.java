package dsa;


import dsa.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class MyArrayListTest {
    dsa.MyArrayList list;
    @BeforeEach
    public void setUp() {
        list = new MyArrayList(2);
    }
    @Test
    public void test_That_New_ArrayList_Is_Empty() {
        assertTrue(list.isEmpty());
    }
    @Test
    public void test_That_New_ArrayList_canDoubleSize() {
        list.add("Java Programming");
        list.add("Python");
        list.add("C");
        list.add("C++");
    }
}
