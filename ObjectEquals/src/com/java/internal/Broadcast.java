package com.java.internal;

import java.util.Objects;

public class Broadcast {
    private String name;
    private String frequency;
    private String isLive;
    private int duration;
    public void setName(String name) {
        this.name = name;
    }
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    public void setIsLive(String isLive) {
        this.isLive = isLive;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String toString() {
        return "Broadcast [name="+name+", frequency="+frequency+", isLive="+isLive+", duration="+duration+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Broadcast) {
            Broadcast b = (Broadcast) o;
            if (Objects.equals(this.name, b.name) && Objects.equals(this.frequency, b.frequency)) {
                System.out.println("Broadcast is matching..");
                return true;
            }
        } return false;
    }
}
