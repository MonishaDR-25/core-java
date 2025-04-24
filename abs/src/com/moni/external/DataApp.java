package com.moni.external;

import com.moni.internal.Storage;

public class DataApp {
    private Storage storage;

    public DataApp(Storage storage) {
        this.storage = storage;
    }

    public void saveData() {
        if (this.storage != null) {
            System.out.println("Saving data in DataApp");
            this.storage.store();
        } else {
            System.err.println("Storage is null");
        }
    }
}
