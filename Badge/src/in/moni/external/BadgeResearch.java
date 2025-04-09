package in.moni.external;

import in.moni.internal.Badge;

public class BadgeResearch {
    public void studyBadge() {
        Badge badge = new Badge();

        System.out.println("\nBadge Analysis:");
        System.out.println("Material: " + badge.getMaterial());
        System.out.println("Serial: " + badge.getSerialNumber());
        System.out.println("Status: " + badge.isActive());
        System.out.println("Weight: " + badge.getWeight());
        System.out.println("Dept: " + badge.getDepartment());
    }
}
