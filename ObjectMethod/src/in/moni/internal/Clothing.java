package in.moni.internal;

public class Clothing {
    String type;
    double cost;

    public Clothing(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String toString() {
        return "Clothing[type=" + type + ", cost=" + cost + "]";
    }
    public void wear() {

        System.out.println("Clothing being worn");
    }
}

