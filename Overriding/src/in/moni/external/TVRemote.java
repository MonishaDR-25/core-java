package in.moni.external;

import in.moni.internal.ApplianceRemote;

public class TVRemote extends ApplianceRemote {
    @Override
    public void control() {
        System.out.println("Controlling TV");
    }

    public void changeChannel() {
        System.out.println("Changing TV channel");
    }
}
