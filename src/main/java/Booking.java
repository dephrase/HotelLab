public class Booking {

    private Bedroom room;
    private int nights;

    public Booking(Bedroom room, int nights) {
        this.room = room;
        this.nights = nights;
    }

    public Bedroom getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    public int getTotalPrice() {
        return room.getRoomType().getNightlyRate() * nights;
    }
}
