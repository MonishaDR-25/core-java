package in.moni.external;

import in.moni.internal.Loan;

public class EducationLoan extends Loan {
    @Override
    public void apply() {
        System.out.println("Applying for education loan");
    }

    public void submitDocuments() {
        System.out.println("Submitting academic documents");
    }
}
