import in.moni.external.Event;
import in.moni.internal.Ritual;

public class ChurchRunner {
    public static void main(String[] args){
        Ritual ritual=new Ritual();
        ritual.performRitual();
        System.out.println("final performed in the church");

        Event event=new Event();
        event.performEvent();
        System.out.println("final event performed at the church");
    }
}
