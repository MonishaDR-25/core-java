package in.moni.external;
import in.moni.internal.Process;

public class HiringProcess extends Process{
    @Override
    public void action() {
        System.out.println("Executing hiring process");
    }

    public void interviewCandidate() {
        System.out.println("Interviewing job candidate");
    }
}
