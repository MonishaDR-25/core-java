package com.xworkz.lambda;

@FunctionalInterface
public interface Predicate <T>{
    boolean test(T t);
}
