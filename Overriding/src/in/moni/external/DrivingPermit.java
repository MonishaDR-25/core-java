package in.moni.external;

import in.moni.internal.Permit;

public class DrivingPermit extends Permit{
@Override
public void authorize() {
    System.out.println("Authorizing driving permit");
}

public void checkEligibility() {
    System.out.println("Checking driver eligibility");
}
}
