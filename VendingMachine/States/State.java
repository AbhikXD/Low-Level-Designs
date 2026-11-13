import POJO.Product;
public interface State {
    public String insertMoney(double orderAmount);
    //public String chooseProduct();
    public String processOrder(int shelfId,int slotId);
    public String dispenseProduct(Product product);
}
