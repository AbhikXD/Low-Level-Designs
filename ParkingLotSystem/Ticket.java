package ParkingLotSystem;

public class Ticket {
    int parkingLot;
    Floor floor;
    Slot slot;

    public Ticket(int parkingLot,Floor floor,Slot slot){
        this.parkingLot = parkingLot;
        this.floor = floor;
        this.slot = slot;
    }

    public void displayTicket(){
        int parkingLotID = parkingLot;
        int floorNumber = floor.getFloorId();
        int slotID = slot.getSlotId();

        System.out.println("TicketID: "+ parkingLotID+ "_"+floorNumber+"_"+slotID);
    }
}
