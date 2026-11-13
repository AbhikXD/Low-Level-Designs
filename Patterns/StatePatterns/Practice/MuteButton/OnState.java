package Practice.MuteButton;

import javax.swing.tree.MutableTreeNode;

public class OnState implements State {
    MuteButton muteButton;

    public  OnState(MuteButton mb){
        this.muteButton = mb;
    }

    @Override
    public void pressButton() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'pressButton'");
        muteButton.poweringOn();
        muteButton.setState(new OffState(muteButton));
    }

}
