package in.moni.internal;

public class Order {
    private String item;
    private int quantity;

    public Order(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{item='" + item + "', quantity=" + quantity + "}";
    }
    public void process() {
        System.out.println("Processing order");
    }
}


