package in.moni.external;

import in.moni.internal.Lecture;

public class OnlineLecture extends Lecture {
    @Override
    public void deliver() {
        System.out.println("Delivering online lecture");
    }

    public void enableChat() {
        System.out.println("Enabling chat feature");
    }
}
