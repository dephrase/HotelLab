import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void setup(){
        bedroom = new Bedroom(RoomType.DOUBLE.getCapacity(), RoomType.DOUBLE, 103);
    }

    @Test
    public void roomHasType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(103, bedroom.getRoomNo());
    }

    @Test
    public void roomStartsAsEmpty(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canAddGuests(){
        Guest guest1 = new Guest("John", RoomType.SUITE);
        Guest guest2 = new Guest("Johnny", RoomType.SUITE);
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuests(){
        Guest guest1 = new Guest("John", RoomType.SUITE);
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.getNumberOfGuests());

    }






}
