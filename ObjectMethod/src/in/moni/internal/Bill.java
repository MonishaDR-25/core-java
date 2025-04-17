package in.moni.internal;

public class Bill {
    private String billType;
    private double amount;

    public Bill(String billType, double amount) {
        this.billType = billType;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{billType='" + billType + "', amount=" + amount + "}";
    }
    public void generate() {
        System.out.println("Generating bill");
    }
}


