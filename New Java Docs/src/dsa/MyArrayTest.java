//package dsa;
//
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class MyArrayTest {
//    ArrayListDSA list;
//    @BeforeEach
//    public void setUp() {
//        list = new ArrayListDSA(4);
//    }
//    @Test
//    public void testAddOneElementArrayList_notEmpty(){
//        list.add(1, "Data Science");
//        assertFalse(list.isEmpty());
//        list.add(2, "Python");
//        assertFalse(list.isEmpty());
//        assertEquals(2, list.getNumberOfElements());
//    }
//    @Test
//    public void testAdd_X_Y_Z_isNotEqual(){
//        list.add(1, "Data Science");
//        list.add(2, "Python");
//        list.add(3, "Java");
//        assertFalse(list.isEmpty());
//        assertEquals(3, list.getNumberOfElements());
//    }
//    @Test
//    public void testAdd_X_Y_Z_S_isEqual(){
//        list.add(1, "Data Science");
//        list.add(2, "Python");
//        list.add(3, "Java");
//        assertFalse(list.isEmpty());
//    }
//}
