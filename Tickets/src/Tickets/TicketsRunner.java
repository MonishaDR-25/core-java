package Tickets;

public class TicketsRunner {
    public static void main(String[] args){
        Passenger passenger1=new Passenger("hansika","chintamani");
        Passenger passenger2=new Passenger("arpita","shirsi");

        Tickets tickets=new Tickets("monisha",400,new Passenger[] {passenger1,passenger2});
         tickets.displayDetails();
    }
}
