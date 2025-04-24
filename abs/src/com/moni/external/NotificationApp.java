package com.moni.external;

import com.moni.internal.Notifier;

public class NotificationApp {
    private Notifier notifier;

    public NotificationApp(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendAlert() {
        if (this.notifier != null) {
            System.out.println("Sending alert in NotificationApp");
            this.notifier.notifyUser();
        } else {
            System.err.println("Notifier is null");
        }
    }
}
