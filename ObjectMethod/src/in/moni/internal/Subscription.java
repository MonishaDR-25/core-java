package in.moni.internal;

public class Subscription {
    private String plan;
    private String user;

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Subscription plan: " + plan + ", User: " + user;
    }
    public void action() {
        System.out.println("Processing subscription");
    }
}


