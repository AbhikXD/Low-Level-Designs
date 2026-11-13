package Patterns.StrategyPattern;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strats){
        strategy = strats;
    }
    public void callExecute(){
        System.out.println("||Context|| Calling the execution logic");
        strategy.executeLogic();
    }
}
