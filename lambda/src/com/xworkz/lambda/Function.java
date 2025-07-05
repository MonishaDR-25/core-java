package com.xworkz.lambda;

@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);

}
