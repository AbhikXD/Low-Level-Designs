package Practice.ServiceNowTicket;

public class PublishedState implements State {
    private Ticket ticket;
    public PublishedState(Ticket ticket){
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
        ticket.publishTicket();
        ticket.setState(new DraftState(ticket));
    }

    @Override
    public void reject() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'reject'");
        ticket.cancelPublishing();
        ticket.setState(new DraftState(ticket));
    }

}
