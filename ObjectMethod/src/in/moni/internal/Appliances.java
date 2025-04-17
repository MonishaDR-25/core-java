package in.moni.internal;

public class Appliances {
    String category;
    double price;

   public Appliances(String category, double price) {
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return "Appliances[category=" + category + ", price=" + price + "]";
    }
    public void start(){
        System.out.println("The appliances are starting");
    }
}
