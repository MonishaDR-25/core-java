package in.moni.internal;

public class MutantTracker {
    public void trackMutant() {
        Mutant mutant = new Mutant();

        // Print initial default values
        System.out.println("Initial Mutant Values:");
        System.out.println("DNA: " + mutant.getDnaSequence());
        System.out.println("Power: " + mutant.getPowerLevel());
        System.out.println("Regeneration: " + mutant.isCanRegenerate());
        System.out.println("Mutation Rate: " + mutant.getMutationRate());
        System.out.println("Origin: " + mutant.getOrigin());

    // Using package-access setters to update values
        mutant.setDnaSequence("AGTCX-123");
        mutant.setPowerLevel(85);
        mutant.setCanRegenerate(true);
        mutant.setMutationRate(99.9);
        mutant.setOrigin("Canada");

    // Print updated values
        System.out.println("\nUpdated Mutant Values:");
        System.out.println("DNA: " + mutant.getDnaSequence());
        System.out.println("Power: " + mutant.getPowerLevel());
        System.out.println("Regeneration: " + mutant.isCanRegenerate());
        System.out.println("Mutation Rate: " + mutant.getMutationRate());
        System.out.println("Origin: " + mutant.getOrigin());
}
}
