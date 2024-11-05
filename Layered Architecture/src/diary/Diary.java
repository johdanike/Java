package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = false;
    private String pin;
    List<Entry>entries ;
    int numberOfNotes;

    public Diary(String userName,String pin) {
        this.pin = pin;
        entries = new ArrayList<>();
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock(String pin) {
        if(pin.equals("correctPin"))isLocked = false;
    }

    public void add(String title, String body) {
        if(!isLocked) {
            Entry entry = new Entry(title, body);
            entries.add(entry);
            numberOfNotes++;
        }
    }
    public void getNumberOfNotes() {
        numberOfNotes++;
    }

    public int size(){
        return entries.size();
    }

    public boolean isEmpty() {
        return false;
    }

    public String findById(int id) {
        if(!isLocked) {
            for(Entry entry : entries) {
                if(entry.getId() == id) {
                    System.out.println(entries.toString());
                }
            }
        }
        return null;
    }

    public String deleteEntry(int id) {
        if (!isLocked) {
            for (int index = 0; index < entries.size(); index++) {
                if (entries.get(index).getId() == id) {
                    entries.remove(index);
                }
            }
            System.out.println("Entry Successfully Deleted");
            return entries.toString();
        }
        return "Id not found";

    }


}
