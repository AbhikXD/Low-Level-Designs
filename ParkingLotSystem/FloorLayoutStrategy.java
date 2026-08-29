package ParkingLotSystem;

import java.util.List;

public interface FloorLayoutStrategy {
    List<Slot> generateLayout(int slotCount);
}
