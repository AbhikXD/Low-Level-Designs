import POJO.Product;

public class ProcessOrderState implements State {
    VendingMachine vendingMachine;
    
    public ProcessOrderState(VendingMachine vm){
        vendingMachine = vm;
    }
    @Override
    public String insertMoney(double orderAmount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMoney'");
    }

    @Override
    public String processOrder(int shelfId, int slotId) {
        try {
            Product product = vendingMachine.selectProduct(shelfId, slotId);
            vendingMachine.displayProductDetails(shelfId, slotId);
            if(vendingMachine.getAmount() < product.getProductPrice()){
                System.out.println("<ProcessOrderState>Please enter enough amount to proceed . . . . ");
                vendingMachine.setState(vendingMachine.getWaitingInputState());;
            }else{
                System.out.println("<ProcessOrderState> Order is getting ready to dispense");
                vendingMachine.setState(new ProcessOrderState(vendingMachine));
            }
            return "Selected product: " + product.getProductName();
        } catch (Exception exception) {
            return exception.getMessage();
        }
    }

    @Override
    public String dispenseProduct(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

}
