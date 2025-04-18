package com.java.internal;
import java.util.Objects;

public class Station {
    private String name;
    private String city;
    private int platforms;
    private boolean junction;
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPlatforms(int platforms) {
        this.platforms = platforms;
    }
    public void setJunction(boolean junction) {
        this.junction = junction;
    }
    public String toString() {
        return "Station [name="+name+", city="+city+", platforms="+platforms+", junction="+junction+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Station) {
            Station s = (Station) o;
            if (Objects.equals(this.name, s.name) && Objects.equals(this.city, s.city)) {
                System.out.println("Station is matching..");
                return true;
            }
        } return false;
    }
}
