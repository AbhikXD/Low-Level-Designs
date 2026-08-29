package ParkingLotSystem;

public class Ticket {
    private int parkingLotId;
    private Floor floor;
    private Slot slot;
    private String ticketId;

    public Ticket(int parkingLotId,Floor floor,Slot slot){
        this.parkingLotId = parkingLotId;
        this.floor = floor;
        this.slot = slot;
        this.ticketId = parkingLotId+"_"+floor.getFloorId()+"_"+slot.getSlotId();
    }

    public String getTicketId(){
        return ticketId;
    }
    public Slot getSlot(){
        return slot;
    }
    public void displayTicket(){
        System.out.println("TicketID: "+ticketId);
    }
}
