package in.moni.internal;

public class Advertisement {
    private String channel_name;
    private int rating;

    public void display() {
        System.out.println("Displaying advertisement");
    }

    public Advertisement(String channel_name, int rating) {
        this.channel_name = channel_name;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Advertisement Channel:" + channel_name +",Rating:" +rating;
    }

}


