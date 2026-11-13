package POJO;

public class Shelves {
    private Slot [] shelves;
    private int shelvesSize;
    private int slotSize;
    private int rowSize;
    public Shelves(int shelvesSize,int slotSize,int rowSize){
        this.shelvesSize = shelvesSize;
        shelves = new Slot[shelvesSize];
        this.slotSize = slotSize;
        this.rowSize = rowSize;
    }
    public boolean insertProduct(int shelfId,int slotId,Product product, int productCount){
        if(shelfId > shelvesSize || shelves[shelfId]!= null){
            return false;
        }
        Slot temp = new Slot(this.rowSize,this.slotSize);
        if( temp.insertItemInSlot(slotId, product, productCount)){ 
        shelves[shelfId] = temp;
        System.out.println("<Shelf> Product added to the Shelf");
        return true;
    }
        return false;
    }
    public boolean removeProduct(int shelfId,int slotId, int productCount){
        if(shelfId> shelvesSize || shelves[shelfId] == null){
            return false;
        }
        Slot temp = shelves[shelfId];
        if(temp.removeItemFromSlot(slotId, productCount)){;
            System.out.println("<Shelf> Item is removed from the Shelf");
            return true;
        }
        return false;
    }

    public Product getSelectedProduct(int shelfId,int slotId){
        if(shelfId > shelvesSize || shelves[shelfId] == null){
            System.out.println("<Shelves> Not a valid shelf || shelf is empty");
            return null;
        }
        Slot slot = shelves[shelfId];
        Product product = slot.getSlotProduct(slotId);
        return product;
    }


    
}
