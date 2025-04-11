package in.moni.external;

import in.moni.internal.Classroom;

public class ScienceClassroom extends Classroom {
    @Override
    public void teach() {
        System.out.println("Teaching science subjects");
    }
    public void conductExperiment() {
        System.out.println("Conducting science experiments");
    }
}
