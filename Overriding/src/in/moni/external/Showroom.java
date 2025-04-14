package in.moni.external;

import in.moni.internal.Car;
import in.moni.internal.Vehicle;

public class Showroom {
    public void roomShow(Vehicle vehicle){
        if(vehicle!=null){
            vehicle.move();
            if(vehicle instanceof Car){
                Car car=(Car)vehicle;
            }
            else{
                System.out.println("this is not a car");
            }
        }
        else{
            System.out.println("Vehicle is null");
        }
    }
}
