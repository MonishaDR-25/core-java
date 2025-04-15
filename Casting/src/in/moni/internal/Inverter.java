package in.moni.internal;

public class Inverter extends Generator{
    public Inverter(){
        System.out.println("No ar const of Inverter");
    }
    @Override
    public void generate(){
        System.out.println("Running Inverter in Generator");
    }

    public void backup(){
        System.out.println("Running backup in Generator");
    }

}
