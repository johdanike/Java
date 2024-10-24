package diary;

public class Entry {
    private String title;
    private String body;
    private int entryNumber;

    public Entry(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Entry(){

    }


    public void add(String title, String body) {
       this.title = title;
       this.body = body;
       entryNumber++;
    }

    public int getEntryNumber() {
        return entryNumber;
    }

    public String getTitle() {

        return title;
    }
}
