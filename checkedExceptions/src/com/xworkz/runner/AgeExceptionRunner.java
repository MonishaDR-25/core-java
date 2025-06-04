package com.xworkz.runner;

import com.xworkz.exceptions.AgeException;

import java.io.IOException;

public class AgeExceptionRunner {
    public static void main(String[] args) throws AgeException, IOException {
        AgeExceptionRunner.checkAge();
        AgeExceptionRunner.InputOutput();
    }


        public static void checkAge() throws AgeException  {
            int age = 12;
            if (age < 0) {
                throw new AgeException("Age cannot be less than zero");
            }
        }

        public static void InputOutput() throws IOException {
            throw new IOException();
        }
    }

