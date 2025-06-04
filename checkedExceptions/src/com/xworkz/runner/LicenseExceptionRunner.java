package com.xworkz.runner;

import com.xworkz.exceptions.LicenseException;

public class LicenseExceptionRunner {
    public static void main(String[] args) throws LicenseException, IllegalStateException {
        LicenseExceptionRunner.checkLicense();
        LicenseExceptionRunner.simulateState();
    }

    public static void checkLicense() throws LicenseException {
        String license = "12AB";
        if (license.length() < 6) {
            throw new LicenseException("License too short");
        }
    }

    public static void simulateState() {
        throw new IllegalStateException();
    }
}
