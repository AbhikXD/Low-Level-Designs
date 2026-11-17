package Patterns.ObserverPattern;

public interface Publishers {

    public void addSubscribers(Subscribers subscriber);
    public void removeSubscribers(Subscribers subscriber);
    public void notifySubscribers();
    public void setTemperature(Double Temperature);
} 
