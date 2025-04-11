package in.moni.external;

import in.moni.internal.Subscription;

public class MagzineSubscription extends Subscription {
    @Override
    public void action() {
        System.out.println("Processing magazine subscription");
    }

    public void deliverIssue() {
        System.out.println("Delivering latest magazine issue");
    }
}
