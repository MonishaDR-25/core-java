package in.moni.external;


import in.moni.internal.Loan;

public class LoanProcessor {
    public void processLoan(Loan loan) {
        if (loan != null) {
            loan.apply();
            if (loan instanceof EducationLoan) {
                EducationLoan educationLoan = (EducationLoan)loan;
                educationLoan.submitDocuments();
            } else {
                System.err.println("This is not a Education loan");
            }
        }
        else {
            System.err.println("Loan is null");
        }

    }
}

