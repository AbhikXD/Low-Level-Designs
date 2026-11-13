
//What does happens to those users actions defined in these class
public class WakeState implements State {
    private Laptop laptop;

    public WakeState(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String pressPowerButton() {
        return "Displaying shutdown menu.";
    }

    @Override
    public String closeLid() {
        // 1. Execute behavior
        laptop.suspendHardware();
        // 2. Transition state!
        laptop.setState(laptop.getSleepState()); 
        return "Laptop went to sleep.";
    }
}