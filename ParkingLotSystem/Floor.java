package ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Floor {
    private int floorId;
    private List<Slot> slots;
    
    public Floor(int floorId, int slotCount){
        this.floorId =floorId;
        FloorLayoutStrategy fls = new StandardFloorLayoutStrgy();

        this.slots = fls.generateLayout(slotCount); 
        
        // // int currentSlotId = 1;
        // for (Map.Entry<VehicleType, Integer> entry : capacityMap.entrySet()) {
        //     VehicleType type = entry.getKey();
        //     int count = entry.getValue();
            
        //     // Generate the requested number of slots for this vehicle type
        //     for (int i = 0; i < count; i++) {
        //         slots.add(new Slot(currentSlotId, null, type));
        //         currentSlotId++;
        //     }
        // }
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
            if(!slot.isOccupiedByVt(vt))
            {
                OccupiedSlotList.add(slot);
            }
        }
        return OccupiedSlotList;
    }

    
}


