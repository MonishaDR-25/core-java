import in.moni.external.Lock;

import in.moni.internal.Security;

public class Runner {
    public static void main(String[] args){
        System.out.println("\n=== Security Hierarchy ===");
        Security security = new Lock();
        Lock lock = new Lock();
    }
}
