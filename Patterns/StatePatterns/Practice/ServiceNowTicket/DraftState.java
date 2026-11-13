package Practice.ServiceNowTicket;

public class DraftState implements State {
    Ticket ticket;
    public DraftState(Ticket ticket){
        this.ticket= ticket;
    }
    @Override
    public void submit() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'submit'");
        ticket.submitTicket();
        ticket.setState(new ReviewState(ticket));
    }

    @Override
    public void accept() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

    @Override
    public void reject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reject'");
    }

}
