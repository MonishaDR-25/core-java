package in.moni.internal;

public class Furniture {
    private String item;
    private int cost;

    public void setItem(String item) {
        this.item = item;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Furniture [item=" + item + ", cost=" + cost + "]";
    }
    public void assemble() {
        System.out.println("Furniture assembled");
    }
}
