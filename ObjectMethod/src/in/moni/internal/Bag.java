package in.moni.internal;

public class Bag {
    String color;
    int capacity;

   public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bag[color=" + color + ", capacity=" + capacity + "]";
    }
        public void carry() {
            System.out.println("Bag carrying items");
        }
    }


