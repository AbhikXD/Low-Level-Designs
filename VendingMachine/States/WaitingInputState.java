import POJO.Product;
public class WaitingInputState implements State {
    VendingMachine vendingMachine;
    public WaitingInputState(VendingMachine vm){
        vendingMachine = vm;
    }
    @Override
    public String insertMoney(double orderAmount) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'insertMoney'");
        System.out.println("Waiting for Money");
        vendingMachine.setAmount(orderAmount);
        vendingMachine.setState(new ProcessOrderState(vendingMachine));
        return "- - - Order Amount Entered - - - ";
    }

    @Override
    public String processOrder(int shelfId, int slotId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processOrder'");
    }

    @Override
    public String dispenseProduct(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

}
