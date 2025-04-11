package in.moni.external;

import in.moni.internal.Museum;

public class ScienceMuseum extends Museum {
    @Override
    public void displayArtifacts() {
        System.out.println("Displaying science exhibits");
    }

    public void hostExperiment() {
        System.out.println("Hosting science experiments");
    }
}
