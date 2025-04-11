package in.moni.external;

import in.moni.internal.Employee;

public class Engineer extends Employee {
    @Override
    public void performDuty() {
        System.out.println("Engineer designing systems");
    }

    public void writeCode() {
        System.out.println("Engineer writing code");
    }
}
