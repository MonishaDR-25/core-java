package in.moni.internal;

public class Loan {
    private String type;
    private int amount;

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Loan [type=" + type + ", amount=" + amount + "]";
    }
    public void apply() {
        System.out.println("Applying for loan");
    }
}

