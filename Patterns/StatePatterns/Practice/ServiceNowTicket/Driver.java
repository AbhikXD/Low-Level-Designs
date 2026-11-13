package Practice.ServiceNowTicket;

public class Driver {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        ticket.ticketSubmission();
        ticket.ticketAccepted();
        ticket.ticketPublish();

        ticket.ticketSubmission();
        ticket.ticketRejected();
        ticket.ticketCancelled();
    }
}
