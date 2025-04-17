package in.moni.internal;

public class Currency {
    String name;
    double value;

    public Currency(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String toString() {
        return "Currency[name=" + name + ", value=" + value + "]";
    }
    public void convert() {
        System.out.println("Converting currency");
    }
}


