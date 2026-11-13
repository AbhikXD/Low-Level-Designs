package Practice.ServiceNowTicket;

public class ReviewState  implements State{
    private Ticket ticket;

    public ReviewState(Ticket ticket){
        this.ticket = ticket;
    }
    @Override
    public void submit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'submit'");
    }

    @Override
    public void accept() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'accept'");
        ticket.performAcception();
        ticket.setState(new PublishedState(ticket));
        
    
    }

    @Override
    public void reject() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'reject'");
        ticket.performRejection();
        ticket.setState(new PublishedState(ticket));
    }

}
