package Patterns.ObserverPattern;

public class Client {
public static void main(String[] args) {
    WeatherStation ws = new WeatherStation();
    ws.addSubscribers(new MobileSubscriber());
    ws.addSubscribers(new AlertSubscriber());
    ws.setTemperature(41.0);
}
}
