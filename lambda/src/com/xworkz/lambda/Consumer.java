package com.xworkz.lambda;


@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
