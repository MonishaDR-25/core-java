package in.moni.internal;

public class Message {
    private String sender;
    private String content;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message [sender=" + sender + ", content=" + content + "]";
    }
    public void send() {

        System.out.println("Message sending");
    }
}

