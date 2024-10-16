package dsa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    private Listt listTest;
    @BeforeEach
    public void setUp() {
        listTest = new Listt(3);
    }

    @Test
    public void testThatArrayListIsNotEmpty() {
        listTest.isEmpty();
    }
    @Test
    public void testThat_iCanAddX_listIsNotEmpty() {
        assertTrue(listTest.isEmpty());
        listTest.add(0,"Java Programming");
        assertFalse(listTest.isEmpty());
        assertEquals(1, listTest.getSize());
    }
    @Test
    public void testThat_iCanAddX_andRemoveX_listIsEmpty() {
        assertTrue(listTest.isEmpty());
        listTest.add(0,"Java Programming 1");
        listTest.add(1,"Java Programming");
        assertEquals(2, listTest.getSize());
        assertFalse(listTest.isEmpty());
        var index = listTest.remove(0);
        assertEquals(1, listTest.getSize());
        System.out.println("Size after removing: "+listTest.getSize());
        System.out.println("Index: "+index);
        assertFalse(listTest.isEmpty());
    }
    @Test
    public void testThat_iCannotRemoveAboveTheLengthOfArrayList(){
        assertThrows(IndexOutOfBoundsException.class, ()-> listTest.remove(4));
    }
    @Test
    public void testThat_iArrayListCanExpandSize(){
        listTest.add(0,"Java Programming");
        listTest.add(1,"Python Programming");
        listTest.add(2,"Ruby Programming");
        listTest.add(3,"C Programming");
        listTest.add(4,"C++ Programming");
        listTest.add(5,"Rust Programming");
        listTest.add(6,"C# Programming");
        System.out.println(listTest.getSize());
        assertEquals(7,listTest.getSize());
    }
    @Test
    public void testThatArrayListContains_pythonProgramming_atIndex_2(){
        listTest.add(0,"Java Programming");
        listTest.add(1,"Python Programming");
        listTest.add(2,"Ruby Programming");
        listTest.add(3,"C Programming");
        listTest.add(4,"C++ Programming");
        Boolean contain = listTest.isContained("Python Programming");
        assertEquals(true,contain);
    }
    @Test
    public void testThatElementPushedInIsAtTheSaidIndex(){
        listTest.add(0,"Java Programming");
        listTest.add(1,"Python Programming");
        listTest.add(2,"Ruby Programming");
    }

}