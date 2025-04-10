import in.moni.external.LED;
import in.moni.internal.Light;

public class Runner {
    public static void main(String[] args){
        System.out.println("\n=== Light Hierarchy ===");
        Light light = new LED();
        LED led = new LED();
    }
}
