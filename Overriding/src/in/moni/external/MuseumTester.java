package in.moni.external;

import in.moni.internal.Museum;

public class MuseumTester {
    public void testMuseum(Museum museum) {
        if (museum != null) {
            museum.displayArtifacts();
            if (museum instanceof ScienceMuseum) {
                ScienceMuseum science = (ScienceMuseum) museum;
                science.hostExperiment();
            } else {
                System.err.println("Not science museum");
            }
        } else {
            System.err.println("Museum is null");
        }
    }
}
