package com.moni.external;

import com.moni.internal.Backup;

public class ManualBackup implements Backup {
    @Override
    public void backupData() {
        System.out.println("Performing Manual Backup");
    }
}
