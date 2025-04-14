package in.moni.external;

import in.moni.internal.Lecture;

public class LectureTester {
    public void test(Lecture lecture) {
        if (lecture != null) {
            lecture.deliver();
            if (lecture instanceof OnlineLecture) {
                OnlineLecture online = (OnlineLecture) lecture;
                online.enableChat();
            } else {
                System.err.println("Not an online lecture");
            }
        } else {
            System.err.println("Lecture is null");
        }
    }
}
