package in.moni.internal;

public class Permit {
    private int number;
    private String issuedBy;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    @Override
    public String toString() {
        return "Permit No: " + number + ", Issued By: " + issuedBy;
    }
    public void authorize() {
        System.out.println("Authorizing permit");
    }
}

