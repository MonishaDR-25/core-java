package com.moni.external;

import com.moni.internal.Storage;

public class LocalStorage implements Storage {
    @Override
    public void store() {
        System.out.println("Storing in LocalStorage");
    }

}
