public class Laptop {
    // Hold references to states to avoid recreating them on every transition
    private final State sleepState;
    private final State wakeState;
    
    private State currentState;

    public Laptop() {
        this.sleepState = new SleepState(this);
        this.wakeState = new WakeState(this);
        // Initial state
        this.currentState = sleepState; 
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getSleepState() { return sleepState; }
    public State getWakeState() { return wakeState; }

    // --- DELEGATION: User actions are routed to the current state ---
    public String pressPowerButton() {
        return currentState.pressPowerButton();
    }

    public String closeLid() {
        return currentState.closeLid();
    }

    // --- INTERNAL BEHAVIORS: Executed by the states ---
    public void activateHardware() {
        System.out.println("[System] Booting up hardware... Lockscreen displayed.");
    }

    public void suspendHardware() {
        System.out.println("[System] Saving data to RAM... Entering power saving mode.");
    }
}