package in.moni.internal;

public class Post {
    private String title;
    private int year;

    public Post(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Post{title='" + title + "', year=" + year + "}";
    }
    public void publish() {
        System.out.println("Publishing post");
    }
}


