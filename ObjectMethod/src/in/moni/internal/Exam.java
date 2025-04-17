package in.moni.internal;

public class Exam {
    private String subject;
    private int maxMarks;

    public Exam(String subject, int maxMarks) {
        this.subject = subject;
        this.maxMarks = maxMarks;
    }

    @Override
    public String toString() {
        return "Exam{subject='" + subject + "', maxMarks=" + maxMarks + "}";
    }
    public void evaluate() {
        System.out.println("Evaluating exam");
    }
}

