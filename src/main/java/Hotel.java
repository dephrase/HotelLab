import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Hotel {

    private String name;
    private Bedroom[] bedrooms;
    private ConferenceRoom[] conferenceRooms;

    public Hotel(String name, Bedroom[] bedrooms, ConferenceRoom[] conferenceRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int getNumberOfBedrooms(){
        return this.bedrooms.length;
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.length;
    }

    public String getName() {
        return name;
    }

    public Bedroom getBedroom(int roomNumber){
        Bedroom target = null;
        for(int i = 0; i < bedrooms.length; i++){
            if(bedrooms[i].getRoomNo() == roomNumber){
                target =  bedrooms[i];
            }
        }
        return target;
    }

    public Bedroom findAvailableRoom(RoomType roomType){
        Bedroom availableRoom = null;
        ArrayList<Bedroom> matchingRooms = new ArrayList<>();
        ArrayList<Bedroom> availableMatchingRooms = new ArrayList<>();

        for(int i = 0; i < bedrooms.length; i++){
            if(bedrooms[i].getRoomType() == roomType){
                matchingRooms.add(bedrooms[i]);
            }
        }
        for(Bedroom room : matchingRooms){
            if(room.getNumberOfGuests() == 0){
                availableMatchingRooms.add(room);
            }
        }
        if(availableMatchingRooms.size() > 0){
            availableRoom = availableMatchingRooms.get(0);
        }
        return availableRoom;
    }

    public void checkin(Guest guest){
        Boolean canCheckIn = false;
        Bedroom room = findAvailableRoom(guest.getRoomPreference());
        if(room != null){
            room.addGuest(guest);
        }
    }

    public void checkout(Guest guest) {
        for(Bedroom room : this.bedrooms){
            if(room.getGuests().contains(guest)){
                room.removeGuest(guest);
            }
        }
    }

    public Booking bookRoom(Bedroom room, int numOfNights) {
        Booking newBooking = new Booking(room, numOfNights);
        return newBooking;
    }
}
