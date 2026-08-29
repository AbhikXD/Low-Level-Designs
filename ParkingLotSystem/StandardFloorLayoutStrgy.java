package ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class StandardFloorLayoutStrgy implements FloorLayoutStrategy {

    @Override
    public List<Slot> generateLayout(int slotCount) {
        List<Slot> slotList = new ArrayList<>();
        Slot slot = null;
        for(int i=1;i<=slotCount;i++){
            if(i == 1){
            slot = new Slot(i,null,VehicleType.Truck);
            }else if(i>1 && i<=3){
            slot = new Slot(i, null, VehicleType.Bike);
            }else{
            slot = new Slot(i, null, VehicleType.Car);
            }
            slotList.add(slot);
        }
        return slotList;
        
    }
    
}
