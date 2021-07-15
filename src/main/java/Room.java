import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;


    public Room(int capacity) {
        this.capacity = capacity;
        guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest newGuest){
        if(getNumberOfGuests() < capacity){
            guests.add(newGuest);
        }
    }


    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests() {
        return getGuests().size();
    }
}
