package in.moni.internal;

public class TankTracker {
    public void trackTank() {
        Tank tank = new Tank();

        System.out.println("Initial Tank Values:");
        System.out.println("Type: " + tank.getType());
        System.out.println("Crew Size: " + tank.getCrewSize());
        System.out.println("Armored: " + tank.isArmored());
        System.out.println("Speed: " + tank.getSpeed());
        System.out.println("Country: " + tank.getCountry());

        tank.setType("Light Tank");
        tank.setCrewSize(3);
        tank.setIsArmored(false);
        tank.setSpeed(85.5);
        tank.setCountry("UK");

        System.out.println("\nUpdated Tank Values:");
        System.out.println("Type: " + tank.getType());
        System.out.println("Crew Size: " + tank.getCrewSize());
        System.out.println("Armored: " + tank.isArmored());
        System.out.println("Speed: " + tank.getSpeed());
        System.out.println("Country: " + tank.getCountry());
    }
}
