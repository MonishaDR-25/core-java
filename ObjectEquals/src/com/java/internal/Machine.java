package com.java.internal;

import java.util.Objects;

public class Machine {
    private String type;
    private int power;
    private String automatic;
    private double price;
    public void setType(String type) {
        this.type = type;
    }
    public void setPower(int power) {

        this.power = power;
    }
    public void setAutomatic(String automatic) {
        this.automatic = automatic;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Machine [type="+type+", power="+power+", automatic="+automatic+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Machine) {
            Machine m = (Machine) o;
            if (Objects.equals(this.type, m.type) && Objects.equals(this.power,m.power)) {
                System.out.println("Machine is matching..");
                return true;
            }
        } return false;
    }
}
