package in.moni.Property;

public class Property {

        private String propertyName;
        private int propertyValue;
        private String location;
        private Owner[] owners; // Array of Owners

        public Property(String propertyName, int propertyValue, String location, Owner[] owners) {
            this.propertyName = propertyName;
            this.propertyValue = propertyValue;
            this.location = location;
            this.owners = owners;
        }

        public void displayDetails() {
            System.out.println("Property Name: " + propertyName + ", Value: " + propertyValue + ", Location: " + location);
            System.out.println("Owners: ");
            for (Owner o : owners) {  // Using for-each loop
                o.display();
            }
        }

}
