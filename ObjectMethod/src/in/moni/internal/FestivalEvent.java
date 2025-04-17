package in.moni.internal;

public class FestivalEvent {
    private String name;
    private String date;

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FestivalEvent [name=" + name + ", date=" + date + "]";
    }
        public void organize() {
            System.out.println("Organizing festival event");
        }
    }

