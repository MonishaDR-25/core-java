package in.moni.external;

import in.moni.internal.Record;

public class MedicalRecord extends Record {
    @Override
    public void action() {
        System.out.println("Managing medical record");
    }

    public void updateDiagnosis() {
        System.out.println("Updating patient diagnosis");
    }
}
