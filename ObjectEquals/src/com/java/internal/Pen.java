package com.java.internal;

import java.util.Objects;

public class Pen {
    private String color;
    private String brand;
    private double price;
    private boolean refillable;

    public Pen(String color,String brand,double price,boolean refillable){
        this.color=color;
        this.brand=brand;
        this.price=price;
        this.refillable=refillable;
    }

    @Override
    public boolean equals(Object obj){
        if(obj!=null && obj instanceof Pen) {
            Pen pen = (Pen) obj;
            if(Objects.equals(this.brand,pen.brand)&& Objects.equals(this.color,pen.color)){
                System.out.println("Pen is matching");
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return "Pen[color:"+color+ ",brand:" +brand+",price:"+price+",refillable"+refillable+"]";
    }
}
