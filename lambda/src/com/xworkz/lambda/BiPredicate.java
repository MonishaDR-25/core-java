package com.xworkz.lambda;

@FunctionalInterface
public interface BiPredicate<T,U> {
    boolean	test(T t, U u);
}
