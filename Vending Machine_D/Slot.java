import java.util.ArrayList;
import java.util.List;

public class Slot {
    //private List<Product> slots;
    //private int productAvailable;
    private int slotSize;
    private int totalProductCount;
    private Product product;

    public Slot(){
        
    }

    public Slot(int slotSize){
        //slots = new ArrayList<>();
        this.slotSize = slotSize;
        totalProductCount = 0;
        this.product = null;
    }
    public void addProductToSlots(Product product,int productCount){
        if(product !=null){
            System.out.println("<Slot> ERROR : Already Product exists in this slot");
            return;
        }
        //for(int i=0;i<productCount;i++){
            if(totalProductCount > slotSize){
                System.out.println(" <Slot> ERROR: Product Count exceeded the slot size");
                totalProductCount = slotSize;
                return;
            }
           // slots.add( product);
            totalProductCount = productCount;
        //}
       this.product = product;
    }

    public void disposeProduct(){
        if(totalProductCount == 0){
            System.out.println("<Slot> ERROR: No product is currently available in slot");
            return;
        }
        System.out.println("<Slot> Disposing the Product !! ");
        totalProductCount--;
    }
    public Product getProduct(){
     Product  product  = this.product;
     return product;
    }
    
}
