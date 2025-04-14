package in.moni.external;

import in.moni.internal.Exam;

public class ExamTester {
    public void test(Exam exam) {
        if (exam != null) {
            exam.evaluate();
            if (exam instanceof OnlineExam) {
                OnlineExam online = (OnlineExam) exam;
                online.autoGrade();
            } else {
                System.err.println("Not online exam");
            }
        } else {
            System.err.println("Exam is null");
        }
    }
}
