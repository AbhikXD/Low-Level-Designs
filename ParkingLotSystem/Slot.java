package ParkingLotSystem;

import java.util.concurrent.atomic.AtomicBoolean;

public class Slot {
    private int slotID;
    private volatile Vehicle vehicle;
    private VehicleType slotType;
    private AtomicBoolean isAvailable;

    public Slot(int slotID,Vehicle vehicle,VehicleType slotType){
        this.slotID = slotID;
        this.vehicle = vehicle;
        this.slotType = slotType;
        this.isAvailable = new AtomicBoolean(vehicle == null);
    }
    public int getSlotId(){
        return slotID;
    }
    public boolean getAvailibilityByVt(VehicleType vt){
        return (vt == slotType && this.isAvailable.get());
    }
    public boolean isOccupiedByVt(VehicleType vt) {
    return (vt == slotType) && !this.isAvailable.get();
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle= vehicle;
    }

    public void freeSlot(){
        this.vehicle = null;
        this.isAvailable.set(true);
    }
    
    public int findAndAllocateSlot(Vehicle vehicle){
        if(vehicle.getVehicleType() == slotType)
        { 
            if(this.isAvailable.compareAndSet(true, false)){
            this.vehicle = vehicle;
            //isAvailable = false;
            return slotID;
            }
        }
        return -1;
    }

}
