package diary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diary {
    private boolean isLocked = false;
    private String pin;
    List<Entry>entries = new ArrayList<>();
    int numberOfNotes;

    public Diary(String userName,String pin) {
        this.pin = pin;
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
        Entry e = new Entry();
        e.add(title, body);
        entries.add(e);
        numberOfNotes++;
    }

    public boolean isEmpty() {
        return false;
    }
}
