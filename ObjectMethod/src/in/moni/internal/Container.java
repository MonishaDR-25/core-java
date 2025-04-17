package in.moni.internal;

public class Container {
    String content;
    int quantity;

    public Container(String content, int quantity) {
        this.content = content;
        this.quantity = quantity;
    }

    public String toString() {
        return "Container[content=" + content + ", quantity=" + quantity + "]";
    }

    public void action() {
        System.out.println("Handling container");
    }
}


