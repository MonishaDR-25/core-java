package in.moni.external;

import in.moni.internal.Zoo;

public class ZooTester {
    public void test(Zoo zoo) {
        if (zoo != null) {
            zoo.displayAnimals();
            if (zoo instanceof BirdSanctuary) {
                BirdSanctuary sanctuary = (BirdSanctuary) zoo;
                sanctuary.feedBirds();
            } else {
                System.err.println("Not a bird sanctuary");
            }
        } else {
            System.err.println("Zoo is null");
        }
    }
}
