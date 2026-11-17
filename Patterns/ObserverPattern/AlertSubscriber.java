package Patterns.ObserverPattern;

public class AlertSubscriber implements  Subscribers{

    @Override
    public void update(Double temperature) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'update'");
        if(temperature > 40){
            System.out.println("ALERT || THE TEMPERATURE IS ABOVE 40. STAY INDOORS!");
        }
    }

}
