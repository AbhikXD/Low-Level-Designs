package Practice.ServiceNowTicket;

public class Ticket {
    private State currState;
    private final State drState;
    private final State revState;
    private final State pubState;

    public Ticket(){
        
        this.drState = new DraftState(this);
        this.revState = new ReviewState(this);
        this.pubState = new PublishedState(this);
        this.currState = drState;
    }
    public void setState(State state){
        currState = state;
    }

    //Operations User will perform

    public void ticketSubmission(){
        currState.submit();
    }

    public void ticketAccepted(){
        currState.accept();
    }
    public void ticketRejected(){
        currState.reject();
    }

    public void ticketPublish(){
        currState.accept();
    }
    public void ticketCancelled(){
        currState.reject();
    }



    //Inner Actions
    public void submitTicket(){
        System.out.println("Ticket is submitted! . . . ");
    }

    public void performAcception(){
        System.out.println("This ticket is accepted . . . . ");
    }

    public void performRejection(){
        System.out.println("This ticket is rejected . . . . .");
    }

    public void cancelPublishing(){
        System.out.println("Ticket is Rejected and Publishing is cancelled . . . . ");
    }
    public void publishTicket(){
        System.out.println("Ticket accepted and Publishing has begun . . . . . .");
    }
}
