package in.moni.external;

import in.moni.internal.Church;

public class Event {
    public void performEvent(){
        Church church=new Church();
        church.prayer();
        System.out.println("Organise event in the Church");
    }
}
