public class DisposeState implements State {
    VendingMachine vm;

    public DisposeState(VendingMachine vm){
        this.vm = vm;
    }
    @Override
    public void noCoinState(double amount) {
        // TODO Auto-generated method stub
        throw new IllegalStateException("Wrong Method");
    }

    @Override
    public void coinInState(int shelfId) {
        // TODO Auto-generated method stub
        throw new IllegalStateException("Wrong Method");
    }

    @Override
    public void disposalState(int shelfId){
       try {
        vm.removeProduct(shelfId, 1);
       } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       }
    }

}
