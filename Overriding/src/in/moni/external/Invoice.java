package in.moni.external;

import in.moni.internal.Document;

public class Invoice extends Document {
    @Override
    public void print() {
        System.out.println("Invoice printed");
    }

    public void calculateTotal() {
        System.out.println("Calculating invoice total");
    }
}
