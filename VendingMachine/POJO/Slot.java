package POJO;

import java.util.concurrent.ConcurrentHashMap;

public class Slot {
    //private Product product;
    private Row productRow;
    private int slotSize;
    private ConcurrentHashMap<Integer, Row> slots;

    public Slot(int rowSize,int slotSize){
        this.slotSize = slotSize;
        slots = new ConcurrentHashMap<>();
        for(int i=0;i<slotSize;i++){
        productRow = new Row(rowSize);
        slots.put(i,productRow);
        }
    }

    public boolean insertItemInSlot(int slotId, Product product,int productCount){
        if(slotId> slotSize){
            return false;
        }
       
        Row temp = slots.get(slotId);
        if(temp.getProduct() == null){
             boolean isProductInserted = temp.insertProduct(product, productCount);
             if(isProductInserted){
                slots.put(slotId,temp);
                System.out.println("<Slot> Product inserted in Slot : "+slotId);
                return true;
             }
        }
        return false;
    }

    public boolean removeItemFromSlot(int slotId, int removeCount){
        boolean isRemoved = false;
        if(slots.containsKey(slotId)){
            Row removeProductRow = slots.get(slotId);
            isRemoved = removeProductRow.removeProduct(removeCount);
            if(isRemoved){
                System.out.println("<Slot> Product is removed . . . ");
            }
        }
        return isRemoved;
    }

    public Product getSlotProduct(int slotId){
        if(slotId> slotSize || !slots.containsKey(slotId) || slots.get(slotId) ==  null){
            System.out.println("<Slots> Slot Id is not valid");
            return null;
        }
        Row rowProduct = slots.get(slotId);
        return rowProduct.getProduct();
    }
}
