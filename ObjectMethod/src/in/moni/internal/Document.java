package in.moni.internal;

public class Document {
    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Document [title=" + title + ", pages=" + pages + "]";
    }
    public void print() {

        System.out.println("Document printed");
    }
}
