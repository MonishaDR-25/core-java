package in.moni.internal;

public class Contract {
    String partyA;
    String partyB;

   public Contract(String partyA, String partyB) {
        this.partyA = partyA;
        this.partyB = partyB;
    }

    public String toString() {
        return "Contract[partyA=" + partyA + ", partyB=" + partyB + "]";
    }
    public void sign() {
        System.out.println("Signing contract");
    }
}


