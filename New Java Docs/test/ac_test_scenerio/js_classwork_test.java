package ac_test_scenerio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class js_classwork_test {

    @Test
    public void reversedArrayTest1() {
        int[] array = {1,2,3,4,5};
        int [] expected = {5,4,3,2,1};
        int[] result = js_classwork.reversedArrayFunc(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void reversedArrayTest2() {
        int [] array = {4,5,2,1,6};
        int [] expected = {6,1,2,5,4};
        int[] result = js_classwork.reversedArrayFunc(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void reversedArrayTest3() {
        int [] array = {1,2,3,4,5};
        int [] expected = {5,4,3,2,1};
        int[] result = js_classwork.reversalMethod(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void reversedArrayTest4(){
        int [] array = {4,5,2,1,6};
        int [] expected = {6,1,2,5,4};
        int [] result = js_classwork.reversalMethod(array);
        assertArrayEquals(expected, result);
    }

}
