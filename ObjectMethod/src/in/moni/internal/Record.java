package in.moni.internal;

public class Record {
    private String title;
    private String format;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Record: " + title + ", Format: " + format;
    }
    public void action() {
        System.out.println("Managing record");
    }
}

