package in.moni.internal;

public class GameConsole {
    private String brand;
    private String model;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "GameConsole [brand=" + brand + ", model=" + model + "]";
    }

        public void loadGame() {
            System.out.println("Loading game");
        }
    }


