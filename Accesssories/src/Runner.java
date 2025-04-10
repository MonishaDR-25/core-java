import in.moni.external.Sneaker;
import in.moni.internal.Accessory;
import in.moni.internal.Shoe;

public class Runner {
    public static void main(String[] args){
        System.out.println("\n=== Accessory Hierarchy ===");
        Accessory accessory = new Sneaker();
        Shoe shoe = new Sneaker();
        Sneaker sneaker = new Sneaker();
    }
}
