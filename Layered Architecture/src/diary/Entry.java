package diary;

public class Entry {
    private String title;
    private String body;
    private String userName;
    private int id;
    private String pin;

    public Entry(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {

        return title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return title + " " + body + " " + userName;
    }

}
