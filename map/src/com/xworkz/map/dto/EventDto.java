package com.xworkz.map.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class EventDto {
    private String eventName;
    private int year;

//    @Override
//    public int hashCode() {
//        return Objects.hash(eventName,year);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(obj!=null){
//            if(obj instanceof EventDto){
//                EventDto casted=(EventDto) obj;
//                return this.eventName.equals(casted.eventName)  && this.year==(casted.year);
//            }
//        }
//        return false;
//    }
}
