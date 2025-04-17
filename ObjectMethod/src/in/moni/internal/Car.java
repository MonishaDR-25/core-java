package in.moni.internal;

import in.moni.internal.Vehicle;

public class Car {
    String model;
    int speed;

   public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String toString() {
        return "Car[model=" + model + ", speed=" + speed + "]";
    }
    public void move(){
        System.out.println("The car is a Vechile");
    }

    public void honk(){
        System.out.println("the car honks");
    }

}
