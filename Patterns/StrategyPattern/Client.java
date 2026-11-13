package Patterns.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new RoadStrategy());
        context.callExecute();
        context.setStrategy(new AirStrategy());
        context.callExecute();
    }
}
