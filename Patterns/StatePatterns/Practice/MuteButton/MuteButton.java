package Practice.MuteButton;

public class MuteButton {

    private State currentState;
    private final State onState;
    private final State offState;

    public MuteButton(){
        onState = new OnState(this);
        offState = new OffState(this);
        currentState = offState;
    }

    public void setState(State setState){
        currentState = setState;
    }

    public void pressButton(){
        currentState.pressButton();
    }

    public void poweringOff(){
        System.out.println("Micophone is powered Off");
    }
    public void poweringOn(){
        System.out.println("Microphone is powered On");
    }
}
