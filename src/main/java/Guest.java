public class Guest {

    private String name;
    private RoomType roomPreference;

    public Guest(String name, RoomType roomPreference){
        this.name = name;
        this.roomPreference = roomPreference;
    }

    public String getName() {

        return this.name;
    }

    public RoomType getRoomPreference() {
        return roomPreference;
    }
}
