public class VendingMachine {
    private Inventory inv;
    private double balance;
    private double insertedAmt;

    public VendingMachine(int slotSize,int shelfSize){
        inv = new Inventory(slotSize, shelfSize);
        insertedAmt = 0;
        balance = 0;
    }

    public double getAmount(){
        return insertedAmt;
    }

    public void setAmount(double amt){
        this.insertedAmt = amt;
    }

    public void fetchProduct(int shelfId,int productCount)throws Exception
    {
        Product selectedProduct = inv.getProductFromShelf(shelfId);
        if(selectedProduct == null){
            this.balance = insertedAmt;
            throw new Exception("<VendingMachine> ERROR: Product is not available in stock");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void removeProduct(int shelfId,int productCount) throws Exception{
        Product removeProduct=  inv.removeProductFromShelves(shelfId, productCount);
        double price = removeProduct.getProductPrice();
        if(price > insertedAmt){
            throw new Exception(" <VendingMachine> ERROR: Entered money is less than the price of the product");
        }
    //     if(removeProduct == null){
    //     System.out.println("<VendingMachine> Product is currently out of stock");
    //     this.balance = amt;
    //     return;
    //   }
      double balance = insertedAmt-price;

        System.out.println("<VendingMachine> Product: "+removeProduct.getProductName()+" || Balance: "+balance +" dispatched");
      
    this.balance=balance;
    }
}
