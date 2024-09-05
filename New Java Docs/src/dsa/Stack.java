package dsa;

public class Stack {
//    private boolean isEmpty = true;
    private int size;
    private final String[] elements;


    public Stack(int capacity) {
        elements = new String[capacity];
    }

    public boolean isEmpty() {
//        return isEmpty;
        return size == 0;
    }

    public void push(String element) {
//        isEmpty = false;
        if(isFull())throw new IllegalArgumentException("Stack is full");
        elements[size] = element;
        size++;
    }

    public String pop() {
      return elements[--size];
    }

    public int size() {
        return size ;
    }

    public boolean isFull() {
        return size == elements.length;
    }
}
