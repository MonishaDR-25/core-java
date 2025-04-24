package com.moni.external;

import com.moni.internal.Notifier;

public class SmsNotifier implements Notifier {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
