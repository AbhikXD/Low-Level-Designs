public class CoinInState implements State {
    VendingMachine vm;
    public CoinInState(VendingMachine vm){
        this.vm = vm;
    }
    @Override
    public void noCoinState(double amount) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'noCoinState'");
        throw new IllegalStateException("Wrong method used");
    }

    @Override
    public void coinInState(int shelfId){
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'coinInState'");
       try{
       vm.fetchProduct(shelfId, 1);
       }
       catch(Exception e){
        System.out.println("<CoinInState> " +e.getMessage());
       }
    }

    @Override
    public void disposalState(int shelfid) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'disposalState'");
      throw new IllegalStateException("Wrong method used");
    }

}
