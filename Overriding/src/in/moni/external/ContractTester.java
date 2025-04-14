package in.moni.external;

import in.moni.internal.Contract;

public class ContractTester {
    public void testContract(Contract contract) {
        if (contract != null) {
            contract.sign();
            if (contract instanceof EmploymentContract) {
                EmploymentContract emp = (EmploymentContract) contract;
                emp.assignRole();
            } else {
                System.err.println("Not employment contract");
            }
        } else {
            System.err.println("Contract is null");
        }
    }
}
