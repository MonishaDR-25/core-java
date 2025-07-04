package com.xworkz.lambda;


@FunctionalInterface
public interface DoubleFunction<R> {
    R apply(double value);
}
