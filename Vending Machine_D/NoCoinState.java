

public class NoCoinState implements State {
    VendingMachine vm ;

    public NoCoinState (VendingMachine vm){
        this.vm = vm;
    }
    @Override
    public void noCoinState(double amount) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'noCoinState'");
        vm.setAmount(vm.getAmount()+amount);
    }

    @Override
    public void coinInState(int shelfId) {
        throw new IllegalStateException("Wrong method used");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'coinInState'");
        
    }

    @Override
    public void disposalState(int shelfId) {
        // TODO Auto-generated method stub
        throw new IllegalStateException("Wrong method used");
    }

}
