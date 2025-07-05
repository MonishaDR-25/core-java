package com.xworkz.lambda;


@FunctionalInterface
public interface DoubleToLongFunction {
    long applyAsLong(double value);
}
