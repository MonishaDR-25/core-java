package com.java.internal;

import java.util.Objects;

public class Filter {
    private String type;
    private String size;
    private String reusable;
    private double cost;
    public void setType(String type) {
        this.type = type;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setReusable(String reusable) {
        this.reusable = reusable;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString() {
        return "Filter [type="+type+", size="+size+", reusable="+reusable+", cost="+cost+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Filter) {
            Filter f = (Filter) o;
            if (Objects.equals(this.type, f.type) && Objects.equals(this.size,f.size)) {
                System.out.println("Filter is matching..");
                return true;
            }
        } return false;
    }
}
