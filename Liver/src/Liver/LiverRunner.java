package Liver;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver = new Liver();
        BileDuct duct = new BileDuct(liver);
        duct.transport();
    }
}
