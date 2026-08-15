package ParkingLotSystem;

public class Vehicle {
    private String regiNumber;
    private VehicleType vt;
    private String color;

    public Vehicle(String regiNumber,VehicleType vt, String color){
        this.regiNumber = regiNumber;
        this.vt = vt;
        this.color = color;
    }

    public VehicleType getVehicleType(){
        return vt;
    }
}
