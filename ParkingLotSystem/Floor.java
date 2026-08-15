package ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorId;
    private List<Slot> slots;
    
    public Floor(int floorId,int slotCount){
        this.floorId =floorId;
        this.slots = new ArrayList<>();
        Slot slot = null;
        for(int i=1;i<=slotCount;i++){
            if(i == 1){
            slot = new Slot(i,null,VehicleType.Truck);
            }else if(i>1 && i<=3){
            slot = new Slot(slotCount, null, VehicleType.Bike);
            }else{
            slot = new Slot(slotCount, null, VehicleType.Car);
            }
            slots.add(slot);
        }
    }

    public int getFloorId(){
        return floorId;
    }

    public Slot findParking(Vehicle vehicle){
        for(Slot slot : slots){
            if(slot.findAndAllocateSlot(vehicle) != -1){
                return slot;
            }
        }
        return null;
    }

    public List<Slot> getFreeSlots(VehicleType vt){
        List<Slot> freeSlotList = new ArrayList<>();
        for(int i=0;i<slots.size();i++){
            Slot slot = slots.get(i);
            if(slot.getAvailibilityByVt(vt))
            {
                freeSlotList.add(slot);
            }
        }
        return freeSlotList;
    }

    public List<Slot> getOccupiedSlots(VehicleType vt){
        List<Slot> OccupiedSlotList = new ArrayList<>();
        for(int i=0;i<slots.size();i++){
            Slot slot = slots.get(i);
            if(!slot.getAvailibilityByVt(vt))
            {
                OccupiedSlotList.add(slot);
            }
        }
        return OccupiedSlotList;
    }

    
}


