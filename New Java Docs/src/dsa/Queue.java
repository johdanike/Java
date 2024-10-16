package dsa;

import java.util.NoSuchElementException;

public class Queue {
    private int number;
    private final String[] values;


    public Queue(int capacity) {
        values = new String[capacity];
    }


    public boolean isQueueEmpty() {
        return number == 0;
    }

    public boolean enqueue(String courses) {
        isFull();
        values[number++] = courses;
        return true;
    }

    public String[] dequeue() {
        if(isEmpty()) throw new NoSuchElementException("Queue is empty");
        String head = indexZero();
        String[] values =shift();
        number--;
        return values;
    }

    public String indexZero(){
        if(isEmpty()) return null;
        return values[0];
    }

    public String[] shift(){
        for(int index = 1; index < values.length; index++) {
            values[index-1] = values[index];
        }
        return values;
    }

    public int numberOfElements() {
        return number;
    }

    public boolean isEmpty() {
        return number==0;
    }

    public void isFull(){
        boolean isFull = number == values.length;
        if(isFull) throw new IllegalStateException("Queue is full");
    }

}