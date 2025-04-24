package com.moni.external;

import com.moni.internal.Notifier;

public class EmailNotifier implements Notifier {
    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}
