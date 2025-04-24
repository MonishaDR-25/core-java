package com.moni.external;

import com.moni.internal.Storage;

public class CloudStorage implements Storage {
    @Override
    public void store() {
        System.out.println("Storing in CloudStorage");
    }
}
