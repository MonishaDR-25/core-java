package in.moni.external;

import in.moni.internal.Tank;

public class TankResearch {
    public void studyTank() {
        Tank tank = new Tank();

        System.out.println("Tank Analysis:");
        System.out.println("Tank Type: " + tank.getType());
        System.out.println("Crew Capacity: " + tank.getCrewSize());
        System.out.println("Armor Status: " + tank.isArmored());
        System.out.println("Maximum Speed: " + tank.getSpeed());
        System.out.println("Manufacturer Country: " + tank.getCountry());
    }
}
