public class Driver {
    private State state;
    private VendingMachine vm;

    public Driver(){
        this.state = new NoCoinState(vm);
    }

    
    
}
