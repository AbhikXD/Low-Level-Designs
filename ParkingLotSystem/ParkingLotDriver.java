package ParkingLotSystem;

import java.util.Map;

public class ParkingLotDriver {
    

    public static void main(String [] args){
        ParkingLot pl = new ParkingLot(1000, 2, 6);
        pl.displayFreeSlots(VehicleType.Bike);
        
    }
}
