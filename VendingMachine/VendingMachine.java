//Context class

import POJO.Product;
import POJO.Shelves;

public class VendingMachine {
    private State currentState;
    private final WaitingInputState waitingInputState;
    private final ProcessOrderState orderProcessState;
    private final DispenseState dispenseState;
    private Shelves shelves;
    private int shelfSize;


    private double amount;
    //private double balance;
    //private double productPrice;
    private Product product;

    public State getWaitingInputState(){
        return waitingInputState;
    }
    
    public State getProcessOrderState(){
        return orderProcessState;
    }
    
    public State getDispenseState(){
        return dispenseState;
    }

    public VendingMachine(int shelvesSize,int slotSize,int rowSize){
        this.shelves = new Shelves(shelvesSize, slotSize, rowSize);
        this.waitingInputState = new WaitingInputState(this);
        this.orderProcessState = new ProcessOrderState(this);
        this.dispenseState = new DispenseState(this);
        this.currentState = waitingInputState;
        this.product = null;
        amount = 0.0;
        //balance = 0.0;
    }

    public void insertProductInVendingMachine(int shelfId,int slotId,int)
    public void setState(State state){
        this.currentState = state;
    }
    //Methods user will interact with
    public void acceptMoney(double insertedAmount)
    {
    //System.out.println("Money Inserted: "+insertedAmount);
     currentState.insertMoney(insertedAmount);   
    }

    public void chooseProduct(int shelfId,int slotId) throws Exception{
        currentState.processOrder(shelfId, slotId);
        
    }

    public void dispensingOrder(){
        currentState.dispenseProduct(product);
    }

    //-----------------

    public double getAmount(){
        return amount;
    }


    public Product getProductfromShelf(int shelfId,int slotId)throws Exception
    {
        this.product = shelves.getSelectedProduct(shelfId, slotId);
        if(product == null){
            throw new IllegalArgumentException("ShelfId or SlotId are not valid");
        }
        return product;
    }

    // public void processOrder(double insertedAmount) throws Exception
    // {
    //     setAmount(insertedAmount);
    //     if(insertedAmount < product.getProductPrice()){
    //         throw new Exception("Price of the product is higher than inserted Amount");
    //     }
    //     currentState.processOrder(product.getProductPrice());
        
    // }

    public double calculateBalance(){
        return Math.abs(amount - product.getProductPrice());
    }
    public void setAmount(double amount){
        this.amount +=amount;
    }

    public void displayProductDetails(int shelfId,int slotId){
        Product product = shelves.getSelectedProduct(shelfId, slotId);
        System.out.println("<Vending Machine>----Product Details -------");
        System.out.println("Product Name: "+product.getProductName());
        System.out.println("ProductId: "+product.getProductId());
        System.out.println("Product Price: "+product.getProductPrice());
    }

    public Product selectProduct(int shelfId,int slotId) throws Exception{
        displayProductDetails(shelfId, slotId);
        return getProductfromShelf(shelfId, slotId);
     //shelves.removeProduct(shelfId, slotId, 1);
    
    }
    
}
