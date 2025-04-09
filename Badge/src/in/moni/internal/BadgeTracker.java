package in.moni.internal;

public class BadgeTracker {
    public void trackBadge() {
        Badge badge = new Badge();

        System.out.println("\nInitial Badge Values:");
        System.out.println("Material: " + badge.getMaterial());
        System.out.println("Serial Number: " + badge.getSerialNumber());
        System.out.println("Active: " + badge.isActive());
        System.out.println("Weight: " + badge.getWeight());
        System.out.println("Department: " + badge.getDepartment());

        badge.setMaterial("plastic");
        badge.setSerialNumber(2001);
        badge.setIsActive(false);
        badge.setWeight(10.2);
        badge.setDepartment("HR");

        System.out.println("\nUpdated Badge Values:");
        System.out.println("Material: " + badge.getMaterial());
        System.out.println("Serial Number: " + badge.getSerialNumber());
        System.out.println("Active: " + badge.isActive());
        System.out.println("Weight: " + badge.getWeight());
        System.out.println("Department: " + badge.getDepartment());
    }
}
