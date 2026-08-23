package ParkingLotSystem;

import java.util.Map;

public class ParkingLotDriver {
    

    public static void main(String [] args){
        ParkingLot pl = new ParkingLot(1000, 2, 6);
        pl.displayFreeSlots(VehicleType.Bike);
        
        Vehicle vehicle = new Vehicle("WB39H 4656D",VehicleType.Bike, "Green");
        pl.parkVehicle(vehicle);
        pl.displayFreeSlots(VehicleType.Bike);
        pl.unParkVehicle("1000_1_2");
        pl.displayFreeSlots(VehicleType.Bike);
        
    }
}
