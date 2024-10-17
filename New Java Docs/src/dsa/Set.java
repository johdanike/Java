package dsa;


public class Set extends Listt {
    public Set(int capacity) {
        super(capacity);
    }

    @Override
    public boolean add(String item) {
        boolean isExist = false;

        for (int index = 0; index < getSize(); index++) {
            if (get(index).equals(item)) {
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            super.add(item);

        }
        return isExist;
    }

    public boolean contains(String item) {
        for (int index = 0; index < getSize(); index++) {
            if (get(index).equals(item)) {
                return true;
            }
        }
        return false;
    }


    public boolean remove(String item){
        for (int index = 0; index < getSize(); index++) {
            if(get(index).equals(item)) {
                super.remove(index);
                return true;
            }
        }
        return false;
    }
}
