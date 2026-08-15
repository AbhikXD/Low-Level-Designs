package ParkingLotSystem;

public class Slot {
    private int slotID;
    private Vehicle vehicle;
    private VehicleType slotType;
    private boolean isAvailable;

    public Slot(int slotID,Vehicle vehicle,VehicleType slotType){
        this.slotID = slotID;
        this.vehicle = vehicle;
        this.slotType = slotType;
        if(vehicle!=null){
        this.isAvailable = false;
        }else{
            this.isAvailable = true;
        }
    }
    public int getSlotId(){
        return slotID;
    }
    public boolean getAvailibilityByVt(VehicleType vt){
        if(vt == slotType && isAvailable){
            return true;
        }
        return false;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle= vehicle;
    }

    public void setAvailibility(boolean flag){
        isAvailable = flag;
    }

    public int findAndAllocateSlot(Vehicle vehicle){
        if(vehicle.getVehicleType() == slotType && isAvailable){
            this.vehicle = vehicle;
            isAvailable = false;
            return slotID;
        }
        return -1;
    }

}
