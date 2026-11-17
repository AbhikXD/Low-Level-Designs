package Patterns.ObserverPattern;

public class MobileSubscriber implements  Subscribers{

    @Override
    public void update(Double temperature) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'update'");
        System.out.println("DISPLAY || The temperature is "+temperature+" C");
    }

}
