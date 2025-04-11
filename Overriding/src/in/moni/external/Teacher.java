package in.moni.external;

import in.moni.internal.Person;

public class Teacher extends Person {
    @Override
    public void work() {
        System.out.println("Teacher working");
    }

    public void teachLesson() {
        System.out.println("Teaching lesson");
    }
}
