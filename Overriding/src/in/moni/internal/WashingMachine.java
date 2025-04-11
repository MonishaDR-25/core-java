package in.moni.internal;

public class WashingMachine extends Appliance{
    @Override
    public void start() {
        System.out.println("Washing machine is starting");
    }

    public void rinseClothes() {
        System.out.println("Rinsing clothes");
    }
}
