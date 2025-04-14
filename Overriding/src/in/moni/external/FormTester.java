package in.moni.external;

import in.moni.internal.Form;

public class FormTester {
    public void test(Form form) {
        if (form != null) {
            form.submit();
            if (form instanceof ApplicationForm) {
                ApplicationForm app = (ApplicationForm) form;
                app.uploadDocuments();
            } else {
                System.err.println("Not an application form");
            }
        } else {
            System.err.println("Form is null");
        }
    }
}
