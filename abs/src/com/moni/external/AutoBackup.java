package com.moni.external;

import com.moni.internal.Backup;

public class AutoBackup implements Backup {
    @Override
    public void backupData() {
        System.out.println("Performing Auto Backup");
    }
}
