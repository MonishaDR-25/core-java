package com.xworkz.collection.dto;

public class SareeDto {
    private String type;
    private String color;
    private String material;
    private double cost;

    public SareeDto(String type, String color, String material, double cost) {
        this.type = type;
        this.color = color;
        this.material = material;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "SareeDto{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public double getCost() {
        return cost;
    }
}
