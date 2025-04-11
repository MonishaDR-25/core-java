package in.moni.external;

import in.moni.internal.Message;

public class Email extends Message {
    @Override
    public void send() {
        System.out.println("Email being sent");
    }

    public void attachFile() {
        System.out.println("Attaching file to email");
    }
}
