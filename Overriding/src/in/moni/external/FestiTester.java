package in.moni.external;


import in.moni.internal.Festi;

public class FestiTester {
    public void testFesti(Festi festi) {
        if (festi != null) {
            festi.celebrate();
            if (festi instanceof Christmas) {
                Christmas christmas = (Christmas) festi;
                christmas.decorateTree();
            } else {
                System.err.println("Not Christmas festival");
            }
        } else {
            System.err.println("Festival is null");
        }
    }
}
