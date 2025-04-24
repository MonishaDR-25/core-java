package com.moni.external;

import com.moni.internal.Backup;

public class BackupApp {
    private Backup backup;

    public BackupApp(Backup backup) {
        this.backup = backup;
    }

    public void doBackup() {
        if (this.backup != null) {
            System.out.println("Running backup in BackupApp");
            this.backup.backupData();
        } else {
            System.err.println("Backup is null");
        }
    }
}
