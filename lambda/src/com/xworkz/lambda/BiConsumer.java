package com.xworkz.lambda;

@FunctionalInterface
public interface BiConsumer<T,U>{
    void accept(T t,U u);
}
