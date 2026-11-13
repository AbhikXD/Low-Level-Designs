import POJO.Product;
public class DispenseState  implements State{
    VendingMachine vendingMachine;
    
    public DispenseState(VendingMachine vm){
        vendingMachine = vm;
    }
    @Override
    public String insertMoney(double orderAmount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMoney'");
    }

    @Override
    public String processOrder(int shelfId, int slotId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processOrder'");
    }

    @Override
    public String dispenseProduct(Product product) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
        
        System.out.println("<DispenseState> Current Balance : "+vendingMachine.calculateBalance());
        vendingMachine.setState(new WaitingInputState(vendingMachine));;
        return "Product Dispensed . . . .";
    }

}
