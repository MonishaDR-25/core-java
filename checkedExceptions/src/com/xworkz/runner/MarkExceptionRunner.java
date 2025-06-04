package com.xworkz.runner;

import com.xworkz.exceptions.MarkException;

public class MarkExceptionRunner {
    public static void main(String[] args) throws MarkException,ArrayIndexOutOfBoundsException {
        MarkExceptionRunner.checkMarks();
        MarkExceptionRunner.simulateIndex();
    }

    public static void checkMarks() throws MarkException {
        int marks = -10;
        if (marks < 0) {
            throw new MarkException("Marks can't be negative");
        }
    }

    public static void simulateIndex() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();

    }
    }

