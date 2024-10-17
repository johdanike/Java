package dsa;

import java.util.Arrays;

public class Listt {
    private int size;
    private String[] list ;

    public Listt(int capacity) {
        this.size = 0;
        this.list = new String[capacity];
    }

    public boolean isEmpty() {
        if(size == 0)return true;
        return false;
    }

    public void add(int index, String course) {
        for(int in = index; in < list.length;in++) {
            if(list[index] == null) {
                list[index] = course;
                size++;
            }
        }
        if(size == list.length) {
            reSize();
        }
    }

    public boolean add(String course) {
        list[size] = course;
        if(size == list.length) {
            reSize();
        }
        size++;
        return true;
    }

    private void reSize(){
        if(list.length == size) {
                String[] newArr = new String[2 * size];
                for (int in = 0; in < size; in++) {
                    newArr[in] = list[in];
                }
                list = newArr;
        }

//        if(size == list.length) {
//            list = Arrays.copyOf(list, list.length*2);
//        }

    }

    public String remove(int index) {
        for(int position = 0; position < size; position++) {
            if(index <0 || index >= size){
                throw new IndexOutOfBoundsException("No such index");
            }
            else if(list[position].equals(list[index])){
                list[position] = null;
                size--;
                shift();
            }
        }
        return list[index];
    }

    public String[] shift(){
        for(int index = 1; index < list.length; index++) {
            list[index-1] = list[index];
        }
        return list;
    }


    public String get(int index) {
        if(index >= 0 && index < size) {
            return list[index];
        }else{
            throw new IndexOutOfBoundsException("No such index");
        }
    }
    public int getSize() {
        return this.size;
    }

    public boolean isContained(String course) {
        for(int index = 0; index < size; index++) {
            if (list[index].equals(course)) {
                return true;
            }
        }
        return false;
    }
}
