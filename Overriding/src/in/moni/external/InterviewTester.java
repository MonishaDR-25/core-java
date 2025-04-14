package in.moni.external;

import in.moni.internal.Interview;

public class InterviewTester {
    public void test(Interview interview) {
        if (interview != null) {
            interview.conduct();
            if (interview instanceof TechInterview) {
                TechInterview tech = (TechInterview) interview;
                tech.askCodingQuestion();
            } else {
                System.err.println("Not tech interview");
            }
        } else {
            System.err.println("Interview is null");
        }
    }
}
