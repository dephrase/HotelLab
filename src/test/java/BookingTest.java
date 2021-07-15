import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom room;

    @Before
    public void setup(){
        room = new Bedroom(2, RoomType.SUITE, 200);
        booking = new Booking(room, 3);
    }

    @Test
    public void bookingHasRoom(){
        assertEquals(room, booking.getRoom());
    }

    @Test
    public void bookHasNumberOfNights(){
        assertEquals(3, booking.getNights());
    }

    @Test
    public void canGetTotalPriceOfBooking(){

        Booking booking = new Booking(room, 3);
        assertEquals(600, booking.getTotalPrice());
    }
}
