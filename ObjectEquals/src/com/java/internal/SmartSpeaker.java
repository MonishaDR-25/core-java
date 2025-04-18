package com.java.internal;
import java.util.Objects;

public class SmartSpeaker {
    private String brand;
    private String assistant;
    private boolean portable;
    private double cost;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }
    public void setPortable(boolean portable) {
        this.portable = portable;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString() {
        return "SmartSpeaker [brand="+brand+", assistant="+assistant+", portable="+portable+", cost="+cost+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof SmartSpeaker) {
            SmartSpeaker s = (SmartSpeaker) o;
            if (Objects.equals(this.brand, s.brand) && Objects.equals(this.assistant, s.assistant)) {
                System.out.println("SmartSpeaker is matching..");
                return true;
            }
        } return false;
    }
}
