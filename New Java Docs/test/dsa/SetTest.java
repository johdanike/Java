package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;
    @BeforeEach
    void setUp() {
        set = new Set(3);
    }

    @Test
    public void testThatSetDoesNotAcceptDuplicateElements(){
        assertTrue(set.isEmpty());
        set.add("Aramide");
        assertFalse(set.isEmpty());
        set.add("Aramide");
        assertEquals(1, set.getSize());
    }
    @Test
    public void testThatSetRemovesElementsFromSpecifiedIndex() {
        assertTrue(set.isEmpty());
        set.add("Aramide");
        assertFalse(set.isEmpty());
        set.add("Jerry");
        assertEquals(2, set.getSize());
        set.remove("Aramide");
        assertEquals(1,set.getSize());
    }
    @Test
    public void testThatSetCanReturnElementsPresent(){
        assertTrue(set.isEmpty());
        set.add("Aramide");
        assertFalse(set.isEmpty());
        set.add("Jerry");
        assertEquals(2, set.getSize());
        assertEquals(true, set.contains("Aramide"));
    }
}
