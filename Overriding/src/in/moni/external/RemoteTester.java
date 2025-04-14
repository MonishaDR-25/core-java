package in.moni.external;

import in.moni.internal.ApplianceRemote;

public class RemoteTester {
    public void testRemote(ApplianceRemote remote) {
        if (remote != null) {
            remote.control();
            if (remote instanceof TVRemote) {
                TVRemote tv = (TVRemote) remote;
                tv.changeChannel();
            } else {
                System.err.println("Not a TV remote");
            }
        } else {
            System.err.println("Remote is null");
        }
    }

}

