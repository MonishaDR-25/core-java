package Tickets;

public class Tickets {
    private String ticketName;
    private int price;
    private String from_add;
    private String to_add;
    private Passenger[] passenger;


    public Tickets(String ticketName,int price, Passenger[] passenger){
        this.ticketName=ticketName;
        this.price=price;
        this.passenger=passenger;
    }

    public void displayDetails() {
        System.out.println("Ticket Name: " + ticketName + ", Price: " + price);
        System.out.print("Passengers: ");
        for (Passenger passengers : passenger) {
            passengers.display();// Using for-each loop
        }


    }



}
