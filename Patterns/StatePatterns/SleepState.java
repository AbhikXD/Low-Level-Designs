//What does happens to those users actions defined in these class
public class SleepState implements State {
    private Laptop laptop;

    public SleepState(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String pressPowerButton() {
        // 1. Execute behavior
        laptop.activateHardware();
        // 2. Transition state!
        laptop.setState(laptop.getWakeState()); 
        return "Laptop woke up.";
    }

    @Override
    public String closeLid() {
        // If it's already sleeping, closing the lid does nothing.
        return "Laptop is already asleep. No action taken.";
    }
}