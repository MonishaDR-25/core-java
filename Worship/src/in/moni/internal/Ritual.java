package in.moni.internal;

public class Ritual {
    public void performRitual(){
        Church church=new Church();
        church.prayer();
        church.meeting();
        //church.gathering(); not accessible (private)
        System.out.println("performing ritual in the church");

    }
}
