package movie;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/book", loadOnStartup = 1)
public class MovieBookingServlet extends GenericServlet {
    public MovieBookingServlet(){
        System.out.println("Creating Movie booking servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String ContactNumber = servletRequest.getParameter("contactnumber");
        Long c_number = 0L;
        if (ContactNumber != null && ContactNumber == "") {
            c_number = Long.parseLong(ContactNumber);
        }
        String MovieName = servletRequest.getParameter("moviename");
        String Location = servletRequest.getParameter("location");
        String TicketPrice = servletRequest.getParameter("ticketprice");
        int t_price = 0;
        if (TicketPrice != null && TicketPrice == "") {
            t_price = Integer.parseInt(TicketPrice);
        }
        String NumberOfTickets = servletRequest.getParameter("numberoftickets");
        int n_tickets = 0;
        if (NumberOfTickets != null && NumberOfTickets == "") {
            n_tickets = Integer.parseInt(NumberOfTickets);

        }
        int amount_payable = t_price * n_tickets;
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1> Thanks for Booking the Ticket</h1> ");
        writer.println("<h2> Your total payable amount is </h2>" + amount_payable);


    }
}
