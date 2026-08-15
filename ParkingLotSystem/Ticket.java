package ParkingLotSystem;

public class Ticket {
    ParkingLot parkingLot;
    Floor floor;
    Slot slot;

    public Ticket(ParkingLot parkingLot,Floor floor,Slot slot){
        this.parkingLot = parkingLot;
        this.floor = floor;
        this.slot = slot;
    }

    public void displayTicket(){
        int parkingLotID = parkingLot.getParkingLotId();
        int floorNumber = floor.getFloorId();
        int slotID = slot.getSlotId();

        System.out.println("TicketID: "+ parkingLotID+ "_"+floorNumber+"_"+slotID);
    }
}
