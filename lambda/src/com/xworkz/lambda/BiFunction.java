package com.xworkz.lambda;

@FunctionalInterface
public interface BiFunction<T,U,R>{
    R apply(T t, U u);
}
