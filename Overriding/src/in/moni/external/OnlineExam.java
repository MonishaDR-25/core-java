package in.moni.external;

import in.moni.internal.Exam;

public class OnlineExam extends Exam {
    @Override
    public void evaluate() {
        System.out.println("Evaluating online exam");
    }

    public void autoGrade() {
        System.out.println("Auto-grading answers");
    }

}
