package in.moni.internal;

public class Classroom {
    private String subject;
    private int students;

    public Classroom(String subject, int students) {
        this.subject = subject;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom{subject='" + subject + "', students=" + students + "}";
    }
    public void teach() {
        System.out.println("Teaching in classroom");
    }
}


