package in.moni.external;

import in.moni.internal.Festival;

public class FestivalTester {
    public void testFestival(Festival festival) {
        if (festival != null) {
            festival.celebrate();
            if (festival instanceof Diwali) {
                Diwali diwali = (Diwali) festival;
                diwali.lightFirecrackers();
            } else {
                System.err.println("Not Diwali");
            }
        } else {
            System.err.println("Festival is null");
        }
    }
}
