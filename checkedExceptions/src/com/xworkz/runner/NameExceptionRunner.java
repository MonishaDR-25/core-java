package com.xworkz.runner;

import com.xworkz.exceptions.NameException;

public class NameExceptionRunner {
    public static void main(String[] args) throws NameException, ClassNotFoundException {
        NameExceptionRunner.checkName();
        NameExceptionRunner.simulateClass();

    }
    public static void checkName() throws NameException{
        String name="Mo";
        if(name.length()<3){
            throw new NameException("Name cannot be less than 3 characters");
        }
    }
    public static void simulateClass() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
