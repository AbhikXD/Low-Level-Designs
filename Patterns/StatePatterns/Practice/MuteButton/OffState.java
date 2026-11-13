package Practice.MuteButton;

public class OffState  implements State{
    MuteButton muteButton;
    
    public OffState(MuteButton mb){
        this.muteButton = mb;
    }
    @Override
    public void pressButton() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'pressButton'");
        muteButton.poweringOff();
        muteButton.setState(new OnState(muteButton));
    }

}
