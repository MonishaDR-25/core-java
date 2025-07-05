package com.xworkz.runner;

import com.xworkz.lambda.Predicate;

public class PredicateRunner {
    public static void main(String[] args) {
        Predicate<Integer> isEven=(Integer val)-> {
            if(val%2==0){
                return true;
            }else{
                return false;
            }
        };
        System.out.println(isEven.test(19));
    }
}
