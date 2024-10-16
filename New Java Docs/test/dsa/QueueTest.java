package dsa;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue(4);
    }

    @Test
    public  void enqueueOneElement_queueIsNotEmptyTest() {
        assertTrue(queue.isQueueEmpty());
        boolean isAdd = queue.enqueue("Software Engineering");
        assertTrue(isAdd);
        assertFalse(queue.isQueueEmpty());
    }
    @Test
    public void enqueueX_EnqueueY_dequeueX_queueIsNotEmptyTest() {
        assertTrue(queue.isQueueEmpty());
        queue.enqueue("Data Science");
        queue.enqueue("Python");
        assertFalse(queue.isQueueEmpty());
    }
    @Test
    public void enqueueX_enqueueY_enqueueZ_queueIsNotEmptyTest() {
        assertTrue(queue.isQueueEmpty());
        queue.enqueue("Data Science");
        queue.enqueue("Python");
        queue.enqueue("Java");
        assertFalse(queue.isQueueEmpty());
    }
    @Test
    public void enqueueX_EnqueueY_dequeueZ_enqueueJ_queueIsNotEmptyTest() {
        assertTrue(queue.isQueueEmpty());
        queue.enqueue("Data Science");
        queue.enqueue("Java");
        queue.enqueue("Python");
        queue.enqueue("GoLang");
        int numElements = queue.numberOfElements();
        assertEquals(numElements, 4);
        assertFalse(queue.isQueueEmpty());
    }
    @Test
    public void enqueueX_enqueueY_dequeueX_queueIsNotEmptyTest() {
        assertTrue(queue.isQueueEmpty());
        queue.enqueue("Data Science");
        queue.enqueue("Python");
        int numElements = queue.numberOfElements();
        assertEquals(numElements, 2);
        queue.dequeue();
        assertFalse(queue.isQueueEmpty());
        int numElements2 = queue.numberOfElements();
        assertEquals(numElements2, 1);
    }
    @Test
    public void enqueueX_dequeueX_queueIsEmptyTest() {
        assertTrue(queue.isQueueEmpty());
        queue.enqueue("Data Science");
        queue.dequeue();
        assertTrue(queue.isQueueEmpty());
    }
//    @Test
//    public void willThrowExceptionIfQueueIsFullTest() {
//        queue.enqueue("Data Science");
//        queue.enqueue("Python");
//        queue.enqueue("GoLang");
//        queue.enqueue("C++");
//        queue.enqueue("Java");
//        assertThrows(IllegalArgumentException.class, () -> queue.enqueue("java"));
//        System.out.println(queue.numberOfElements());
//    }
    @Test
    public void i_enqueue_X_and_Y_i_have_2_elements_in_queueTest() {
        queue.enqueue("Data Science");
        queue.enqueue("Python");
        int numElements = queue.numberOfElements();
        assertEquals(numElements, 2);
    }
    @Test
    public void i_enqueue_X_and_Y_i_have_2_elements_i_dequeue_X_i_have_1_element_in_queueTest() {
        queue.enqueue("Data Science");
        queue.enqueue("Python");
        int numElements = queue.numberOfElements();
        assertEquals(numElements, 2);
        queue.dequeue();
        assertFalse(queue.isQueueEmpty());
        int numElements2 = queue.numberOfElements();
        assertEquals(numElements2, 1);
    }
    @Test
    public void i_enqueue_X_i_have_1_elements_i_dequeue_X_i_have_zero_element_in_queueTest(){
        queue.enqueue("Data Science");
        int numElements = queue.numberOfElements();
        assertEquals(numElements, 1);
        queue.dequeue();
        assertTrue(queue.isQueueEmpty());
        int numElements2 = queue.numberOfElements();
        assertEquals(numElements2, 0);
    }

}
