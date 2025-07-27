package com.xworkz.icecream.service;

import com.xworkz.icecream.dto.IceCreamDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class IceCreamServiceImpl implements IceCreamService{

     Map<String, Double> flavourPrice = new HashMap<>();
     List<String> coupons = new ArrayList<>();

    public IceCreamServiceImpl() {
        System.out.println("Ice cream service implemented");
        flavourPrice.put("Vanilla", 50.0);
        flavourPrice.put("Chocolate", 60.0);
        flavourPrice.put("Strawberry", 55.0);

        coupons.add("CASHBACK");
        coupons.add("DISC10");
        coupons.add("OFFER");
    }

    @Override
    public boolean save(IceCreamDto iceCreamDto) {
        System.out.println("Saving IceCreamDto"+iceCreamDto);

       if(iceCreamDto!=null){
           if(iceCreamDto.getName().length()<2 || iceCreamDto.getName().length()>20){
               System.out.println("Name is invalid");
               return false;
           }
           if(iceCreamDto.getQuantity()<1 || iceCreamDto.getQuantity()>20){
               System.out.println("Order Invalid");
               return false;
           }

           if(!flavourPrice.containsKey(iceCreamDto.getFlavour())){
               System.out.println("Flavour not available");
               return false;
           }

           if(!coupons.contains(iceCreamDto.getCoupon())){
               System.out.println("Invalid Coupon");
               return false;
           }

           if(iceCreamDto.getTakeAway()==null || iceCreamDto.getTakeAway().isEmpty()){
               System.out.println("Take away is null or empty");
           }

       }
        System.out.println("Ice cream data is good...");
        return true;
    }

    @Override
    public Double getTotal(IceCreamDto iceCreamDto) {
        Double price= flavourPrice.get(iceCreamDto.getFlavour());
        Double total= price* iceCreamDto.getQuantity();
        if(coupons.contains(iceCreamDto.getCoupon())){
            total=total-(total*0.10);
            System.out.println("Total amount is:"+total);
        }

        return total;
    }
}
