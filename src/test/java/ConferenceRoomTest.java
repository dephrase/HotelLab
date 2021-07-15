import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void setup(){
        conferenceRoom = new ConferenceRoom( 100, "Meeting Room");
    }

    @Test
    public void roomHasName(){
        assertEquals("Meeting Room", conferenceRoom.getName());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(100,  conferenceRoom.getCapacity());
    }

    @Test
    public void roomStartsAsEmpty(){
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void cantAddGuestIfCapacityIsFull(){
        Room fullRoom = new ConferenceRoom(2, "Johns room");
        Guest guest1 = new Guest("John", RoomType.SUITE);
        Guest guest2 = new Guest("Johnson", RoomType.SUITE);
        Guest guest3 = new Guest("Johnsonite", RoomType.SUITE);
        fullRoom.addGuest(guest1);
        fullRoom.addGuest(guest2);
        fullRoom.addGuest(guest3);
        assertEquals(2, fullRoom.getNumberOfGuests());
    }
}
