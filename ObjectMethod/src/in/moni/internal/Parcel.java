package in.moni.internal;

public class Parcel {
    private String sender;
    private String recipient;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Parcel from: " + sender + ", to: " + recipient;
    }
    public void ship() {
        System.out.println("Shipping parcel");
    }
}



