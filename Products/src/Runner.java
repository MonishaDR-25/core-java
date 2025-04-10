import in.moni.external.Sofa;
import in.moni.internal.Furniture;
import in.moni.internal.Product;

public class Runner {
    public static void main(String[] args){
        System.out.println("\n=== Product Hierarchy ===");
        Product product = new Sofa();
        Furniture furniture = new Sofa();
        Sofa sofa = new Sofa();
    }
}

