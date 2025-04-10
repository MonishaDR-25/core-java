import in.moni.external.Revolver;
import in.moni.internal.Tool;
import in.moni.internal.Weapon;

public class Runner {
    public static void main(String[] args){
        System.out.println("\n=== Tool Hierarchy ===");
        Tool tool = new Revolver();
        Weapon weapon = new Revolver();
        Revolver revolver = new Revolver();

    }
}
