package dsa;

import java.util.Arrays;

public class MyArrayList {
    private String [] elements;
    private int size;

    public MyArrayList(int capacity) {
        elements = new String[capacity];
        size = 0;
    }


    public boolean isEmpty() {
        return size == 0;
    }
    public void add(String element) {
        if (size == elements.length) {
            reSize();
        }
        elements[size] = element;
        size++;
    }
    public void clear(){
        Arrays.fill(elements, null);
        size = 0;
    }

    public boolean contains(String element) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public String getElements(int index) {
        indexChecker(index);
        return elements[index];
    }

    public int getSize() {
        return size;
    }

    void reSize(){
        if(size >= elements.length){
            elements = Arrays.copyOf(elements, size * 2);
        }
    }

    public void indexChecker(int index) {
        if(index >= 0 && index < size){
            elements[index] = "";
        }
        else throw new IndexOutOfBoundsException();
    }

    public void remove(int index) {
        indexChecker(index);
        int unMoved = size - index - 1;
        if(unMoved > 0){
            System.arraycopy(elements, index + 1, elements, index, unMoved);
        }
        elements[--size] = "";
    }



}
