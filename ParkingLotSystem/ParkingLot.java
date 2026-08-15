package ParkingLotSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ParkingLot {
    private int parkingLotId;
    private int floorCount;
    private int slotCount;
    private List<Floor> floors;
    private Map <Integer,List<Slot>> freeSlotPerFloor;
    private Map <Integer,List<Slot>> occSlotPerFloor;


    public ParkingLot(int parkingLotId,int floorCount,int slotCount){
        this.parkingLotId = parkingLotId;
        this.floorCount =floorCount;
        this.slotCount =slotCount;
        this.floors = new ArrayList<>();
        freeSlotPerFloor = new HashMap<>();
        occSlotPerFloor = new HashMap<>();
        createParkingLot();
    }

    public int getParkingLotId(){
        return parkingLotId;
    }
    
    public void createParkingLot(){
        for(int i=1;i<=floorCount;i++){
            Floor floor = new Floor(i,slotCount);
            floors.add(floor);
        }
        System.out.println("^^^^ Parking Lot Created with Floor : "+floorCount +" and Slot : "+slotCount+" ^^^^^^");
    }

    public void parkVehicle(Vehicle vehicle){
        Slot slot = null;
        for(Floor floor: floors){
            slot = floor.findParking(vehicle);
            if(slot !=null){
                break;
            }
        }
        if(slot == null){
            System.out.println("---- Parking Lot Full ------");
        }else{
            System.out.println(" Vehicle is parked at : ");;
        }
    }


    public void displayFreeSlots(VehicleType vt){
        getFreeSlots(vt);
        for(int i=1;i<=floorCount;i++){
            List<Slot> freeSlot = freeSlotPerFloor.get(i);
            System.out.println("Free Slots available for "+vt+" on Floor "+i);
            for(int j=0;j<freeSlot.size();j++){
                System.out.print(freeSlot.get(i).getSlotId()+ " ");
            }
        }
        
    }

    public void displayOccupiedSlots(VehicleType vt){
        getOccupiedSlots(vt);
        for(int i=1;i<=floorCount;i++){
           List<Slot> occupiedSlots =  occSlotPerFloor.get(i);
           System.out.println("Occupied Slots available for "+vt+" on Floor "+i);
            for(int j=0;j<occupiedSlots.size();j++){
                System.out.print(occupiedSlots.get(i).getSlotId()+ " ");
            }
        }
    }

    public void displayNumberOfFreeSlots(VehicleType vt){
        getFreeSlots(vt);
        for(int i=1;i<=floorCount;i++){
            int count = freeSlotPerFloor.get(i).size();
            System.out.println("No. of Free Slot for "+vt+" on floor "+i+ " :"+count);
        }
    }
    public void displayNumberOfOccSlots(VehicleType vt){
        getOccupiedSlots(vt);
        for(int i=1;i<=floorCount;i++){
            int count = occSlotPerFloor.get(i).size();
            System.out.println("No. of Occupied Slots for "+vt+" on floor "+i+ " :"+count);
        }
    }



    public void getFreeSlots(VehicleType vt){
        for(int i=0;i<floors.size();i++){
            Floor floor =floors.get(i);
            List<Slot> freeSlot = floor.getFreeSlots(vt);
            freeSlotPerFloor.put(floor.getFloorId(),freeSlot);
        }
    }

    public void getOccupiedSlots(VehicleType vt){
        for(int i=0;i<floors.size();i++){
            Floor floor =floors.get(i);
            List<Slot> OccupiedSlot = floor.getFreeSlots(vt);
            occSlotPerFloor.put(floor.getFloorId(), OccupiedSlot);
            
        }
    }


}
