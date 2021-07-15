import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNo;

    public Bedroom(int capacity, RoomType roomType, int roomNo) {
        super(capacity);
        this.roomType = roomType;
        this.roomNo = roomNo;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getCapacity() {
        return this.roomType.getCapacity();
    }

    public int getRoomNo() {
        return roomNo;
    }
}
