package in.moni.external;

import in.moni.internal.Interview;

public class TechInterview extends Interview {
    @Override
    public void conduct() {
        System.out.println("Conducting technical interview");
    }

    public void askCodingQuestion() {
        System.out.println("Asking coding problems");
    }
}
