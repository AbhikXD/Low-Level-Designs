package Patterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publishers{
    
    List<Subscribers> subscriberList ;
    private Double temperature;

    public WeatherStation(){
        subscriberList = new ArrayList<>();
    }
    @Override
    public void addSubscribers(Subscribers subscriber) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addSubscribers'");
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscribers(Subscribers subscriber) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removeSubscribers'");
        System.out.println("REMOVE Subscribers || UNIMPLEMENTED METHOD");
    }

    @Override
    public void notifySubscribers() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'notifySubscribers'");
        for(Subscribers sub : subscriberList){
            sub.update(temperature);
        }
    }

    @Override
    public void setTemperature(Double temp) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'setTemperature'");
        temperature = temp;
        notifySubscribers();
    }
}
