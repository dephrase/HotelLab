import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom familyRoom;

    @Before
    public void setup(){
        Bedroom familyRoom = new Bedroom(4, RoomType.FAMILY, 101);
        Bedroom juniorSuite = new Bedroom(2, RoomType.SUITE, 300);
        ConferenceRoom conferenceRoom = new ConferenceRoom(50, "The Barry Room");
        Bedroom[] bedrooms = new Bedroom[2];
        bedrooms[0] = familyRoom;
        bedrooms[1] = juniorSuite;
        ConferenceRoom[] conferenceRooms = new ConferenceRoom[1];
        conferenceRooms[0] = conferenceRoom;
        hotel = new Hotel("Hilton", bedrooms, conferenceRooms);
    }

    @Test
    public void hotelHasBedrooms(){
        assertEquals(2, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hotelHasConferenceRooms(){
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void hotelHasName(){
        assertEquals("Hilton", hotel.getName());
    }

    @Test
    public void canReturnAvailableRoom(){
        Bedroom availableRoom = hotel.findAvailableRoom(RoomType.SUITE);
        assertEquals(300, availableRoom.getRoomNo());
    }

    @Test
    public void returnNullIfNoRoomsAvailable(){
        assertEquals(null, hotel.findAvailableRoom(RoomType.SINGLE));
    }

    @Test
    public void hotelCanCheckInGuest(){
        Guest guest = new Guest("John", RoomType.SUITE);
        hotel.checkin(guest);
        assertEquals(1, hotel.getBedroom(300).getNumberOfGuests());
    }

    @Test
    public void hotelCanCheckOutGuest(){
        Guest guest = new Guest("John", RoomType.SUITE);
        hotel.checkin(guest);
        hotel.checkout(guest);
        assertEquals(0, hotel.getBedroom(300).getNumberOfGuests());
    }

    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(familyRoom, 3);
        assertEquals(3, booking.getNights());
    }
}
