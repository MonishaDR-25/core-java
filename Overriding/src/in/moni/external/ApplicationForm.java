package in.moni.external;

import in.moni.internal.Form;

public class ApplicationForm extends Form {
    @Override
    public void submit() {
        System.out.println("Submitting application");
    }

    public void uploadDocuments() {
        System.out.println("Uploading supporting documents");
    }
}
