package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack strings;

    @BeforeEach
    public void setUp() {
         strings = new Stack(3);
    }

    @Test
    public void newStackIsEmptyTest() {
        assertTrue(strings.isEmpty());
    }

    @Test
    public void pushOneElement_stackIsNotEmptyTest() {
        assertTrue(strings.isEmpty());
        strings.push("The Good-news");
        assertFalse(strings.isEmpty());
    }

    @Test
    public void pushX_popX_stackIsEmptyTest() {
        strings.push("The Good-news");
        assertFalse(strings.isEmpty());
        strings.pop();
        assertTrue(strings.isEmpty());
    }
    @Test
    public void pushX_pushY_popY_stackIsNotEmptyTest() {
        strings.push("The Good-news");
        strings.push("The Good-Shepherd");
        strings.pop();
        assertFalse(strings.isEmpty());
    }
    @Test
    public void pushXY_popX_Test(){
        strings.push("The Good-news");
        strings.push("The Good-Shepherd");
        strings.pop();
        assertEquals(1, strings.size());
        System.out.println(strings.size());
    }
    @Test
    public void pushXYZ_stackIsFull_Test(){
        strings.push("The Good-news");
        strings.push("The Good-Shepherd");
        strings.push("The Good-Lamb");
        assertTrue(strings.isFull());
    }
    @Test
    public void pushXY_stackIsNotFull_Test(){
        strings.push("The Good-news");
        strings.push("The Good-Shepherd");
        strings.pop();
        assertEquals(1, strings.size());
    }
    @Test
    public void willThrowException_ifStackIsFull_Test(){
        strings.push("The Good-news");
        strings.push("The Good-Shepherd");
        strings.push("The Good-Lamb");
        assertThrows(IllegalArgumentException.class, () -> strings.push("The Good-Lamb"));
    }
    @Test
    public void pushXYZ_popZ_stackIs2_Test(){
        strings.push("The Good-news");
        strings.push("The Good-Shepherd");
        strings.push("The Good-Lamb");
        strings.pop();
        assertEquals(2, strings.size());
    }
    @Test
    public void pushXYZ_popZYX_Test(){
        strings.push("X");
        strings.push("Y");
        strings.push("Z");
        assertEquals("Z", strings.pop());
        assertEquals("Y", strings.pop());
        assertEquals("X", strings.pop());
    }
}
