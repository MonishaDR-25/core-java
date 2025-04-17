package in.moni.internal;

public class Booth {
    String location;
    boolean isOpen;

   public Booth(String location, boolean isOpen) {
        this.location = location;
        this.isOpen = isOpen;
    }

    public String toString() {
        return "Booth[location=" + location + ", isOpen=" + isOpen + "]";
    }
        public void serve() {
            System.out.println("Serving at booth");
        }
    }

