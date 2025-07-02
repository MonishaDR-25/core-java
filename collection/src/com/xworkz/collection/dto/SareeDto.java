package com.xworkz.collection.dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class SareeDto implements Comparable<SareeDto> {
    private String type;
    private String color;
    private String material;
    private double cost;

    @Override
    public int compareTo(SareeDto o) {
        System.out.println("Running compareTo");
        SareeDto leftSide=this;
        SareeDto rightSide=o;
        //if(leftSide.cost== rightSide.cost){
            //return 0;
       // } else if(leftSide.cost>rightSide.cost) {
          //  return 99;

        //}
        //else
          //  return -99;
        return Double.compare(leftSide.cost,rightSide.cost);
        //for non primitive use compareTo() method
    }
}
