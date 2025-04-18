package com.java.internal;

import java.util.Objects;

public class TrafficLight {
    private String location;
    private boolean isWorking;
    private int timer;
    private String color;
    public void setLocation(String location) {
        this.location = location;
    }
    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }
    public void setTimer(int timer) {
        this.timer = timer;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "TrafficLight [location="+location+", isWorking="+isWorking+", timer="+timer+", color="+color+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof TrafficLight) {
            TrafficLight t = (TrafficLight) o;
            if (Objects.equals(this.location, t.location) && Objects.equals(this.color, t.color)) {
                System.out.println("TrafficLight is matching..");
                return true;
            }
        } return false;
    }
}
