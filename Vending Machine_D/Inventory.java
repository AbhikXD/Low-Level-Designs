import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
  private ConcurrentHashMap<Integer, Slot> shelves ;
  private Slot slot;
  private int slotSize;

  public Inventory(int slotSize,int shelfSize){
    this.slotSize = slotSize;
    shelves = new ConcurrentHashMap<>();

    //Adding the slots to Shelves
    for(int i =0;i<shelfSize;i++){
        shelves.put(i,new Slot());
    }
  }
 

  public void addProductsToShelves(int shelfId,Product product,int productCount){
    Slot temp = shelves.get(shelfId);
    if(temp == null){
        System.out.println("<Inventory> ERROR : Wrong shelfId");
        return;
    }
    
    slot = new Slot(slotSize);
    slot.addProductToSlots(product, productCount);
    shelves.put(shelfId,slot);
  }

  public Product getProductFromShelf(int shelfId){
    return shelves.get(shelfId).getProduct();
  }
  
  public Product removeProductFromShelves(int shelfId, int removeCount){
    Slot temp = shelves.get(shelfId);
    if(temp == null){
        System.out.println("<Inventory> ERROR : Wrong shelfId");
        return null;
    }
    for(int i=0;i<removeCount;i++){
        temp.disposeProduct();
    }
    return temp.getProduct();
  }
}
