package dsa;

public class ArrayListDSA {
    private int number;
    private String[] array;


    public ArrayListDSA(int capacity) {
        array = new String[capacity];
    }

    public boolean isEmpty() {
        return number == 0;
    }

    public void add(int counter, String course) {
        for(int index = number; index > counter; index--) {
            array[index] = array[index - 1];
        }
        array[counter] = course;
        number++;
    }
//    private void reSize(){
//        if
//    }
    public boolean remove(String course) {

        number--;
        return true;
    }
    public int getNumberOfElements() {
        return number;
    }
    public void isFull(){
        boolean isFull = number == array.length;
        if(isFull){throw new IllegalArgumentException("ArrayList is full");}
    }
}
