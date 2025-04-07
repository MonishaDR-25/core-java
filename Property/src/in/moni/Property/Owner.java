package in.moni.Property;

public class Owner {

        private String name;
        private String address;

        public Owner(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public void display() {
            System.out.println("Owner Name: " + name + ", Address: " + address);
        }

}
